package swiftanalysis;

import swiftanalysis.generated.SwiftLexer;
import swiftanalysis.generated.SwiftParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * Responsible for finding all Swift files in a project and generating parse trees.
 */
class ProjectParser {

    /**
     * Parses all Swift files in the given project path.
     *
     * @param projectPath absolute path to the Swift project
     * @return a stream of parse trees of all Swift files in the project
     */
    Stream<AST> parseProject(File projectPath) {
        Stream<File> files = getProjectFiles(projectPath);
        return files.map(ProjectParser::parseFile);
    }

    /**
     * Generates a parse tree from a given Swift file.
     * Uses the lexer and parser swiftanalysis.generated by ANTLR.
     *
     * @param file the Swift file
     * @return the parse tree
     */
    private static AST parseFile(File file) {
        CharStream input = null;
        try {
            input = new ANTLRInputStream(new FileReader(file));
        } catch (IOException e) {
            System.err.println("Could not read " + file.getAbsolutePath());
        }
        SwiftLexer lexer = new SwiftLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SwiftParser parser = new SwiftParser(tokens);
        return new AST(file, parser.topLevel(), parser);
    }

    /**
     * Returns a stream of all Swift files in a given project path.
     *
     * @param projectPath the absolute project path
     * @return a stream of files in the project path
     */
    private Stream<File> getProjectFiles(File projectPath) {
        Stream.Builder<File> streamBuilder = Stream.builder();
        addSwiftFiles(projectPath, streamBuilder);
        return streamBuilder.build();
    }

    /**
     * Recursively adds all files ending with .swift to the given stream builder
     *
     * @param file the file or directory to add
     * @param streamBuilder all files will be added to this stream builder
     */
    private void addSwiftFiles(File file, Stream.Builder<File> streamBuilder) {
        if (file.isFile()) {
            if (file.getName().endsWith(".swift")) {
                streamBuilder.add(file);
            }
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    addSwiftFiles(f, streamBuilder);
                }
            } else {
                System.err.println("Could not open " + file.getAbsolutePath());
            }
        } else {
            System.err.println(file.getAbsolutePath() + " is not a file nor a directory");
        }
    }

}