import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Specify a project path");
            return;
        }

        List<File> files = new ArrayList<File>(){};
        addSwiftFiles(new File(args[0]), files);
        for (File file : files) {
            analyzeFile(file);
        }

        MscrMetricsListener.printSummary();
    }

    private static void analyzeFile(File file) throws IOException {
        System.out.println("Analyzing " + file.getAbsolutePath());
        CharStream input = new ANTLRInputStream(new FileReader(file));
        SwiftLexer lexer = new SwiftLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SwiftParser parser = new SwiftParser(tokens);
        SwiftParser.TopLevelContext tree = parser.topLevel();
        ParseTreeWalker.DEFAULT.walk(new MscrMetricsListener(), tree);
    }

    // recursively add .swift files to fileCollection
    private static void addSwiftFiles(File file, List<File> fileCollection) {
        if (file.isFile()) {
            if (file.getName().endsWith(".swift")) {
                fileCollection.add(file);
            }
        } else {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    addSwiftFiles(f, fileCollection);
                }
            }
        }
    }

}