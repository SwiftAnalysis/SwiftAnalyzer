package swiftanalysis.analyzers;

import swiftanalysis.AST;
import swiftanalysis.ProjectParser;
import swiftanalysis.output.Printer;

import java.io.File;
import java.util.stream.Stream;

/**
 * Base analyzer that analyses file by file.
 */
public abstract class ProjectAnalyzer implements Analyzer {

	public Printer printer;

    /**
     * Number of files processed in the current project.
     */
    int numFiles;

    /**
     * Number of files parsed successfully in the current project.
     */
    int numSucceededFiles;

	public ProjectAnalyzer(Printer printer) {
		this.printer = printer;
	}
    /**
     * Calls analyzeFile for each file.
     *
     * @param projectPath project directory
     * @param astStream stream of ASTs
     */
    public void analyzeProject(File projectPath, Stream<AST> astStream) {
        System.out.println();
        System.out.println("#");
        System.out.println("# Project: " + projectPath.getAbsolutePath());
        System.out.println("#");

        if (printer != null) {
            if (projectPath.isDirectory()) {
                printer.setOutputFileDirectory(projectPath.getAbsolutePath());
            } else {
                printer.setOutputFileDirectory(projectPath.getParent());
            }
        }

        numFiles = 0;
        numSucceededFiles = 0;
        astStream.forEach(this::processFile);
        System.out.printf("\n%d/%d files succeeded\n", numSucceededFiles, numFiles);
    }

    /**
     * Processes a file and analyzes the file when it is successfully parsed, otherwise report the parse error.
     *
     * @param ast the AST containing file name, tree, parser and optionally the parse error
     */
    private void processFile(AST ast) {
        numFiles++;
        ProjectParser.ErrorListener.ParseError error = ast.getParseError();
        if (error != null) {
            reportParseError(error, ast.getFile());
        } else {
            numSucceededFiles++;
            this.analyzeFile(ast);
        }
    }

    /**
     * Reports a parse error.
     *
     * @param error the error containing message, line and column
     * @param file the file
     */
    private void reportParseError(ProjectParser.ErrorListener.ParseError error, File file) {
        String msg = error.getMsg();
        int line = error.getLine();
        int column = error.getCharPositionInLine() + 1;

//        System.err.printf("\n%s\nin file: %s\nat: %d:%d\n", msg, file.getAbsolutePath(), line, column);
    }

    /**
     * Called for each file. Implement this to analyze a file ASTs.
     *
     * @param ast the AST, contains file name, tree, and parser
     */
    public void analyzeFile(AST ast) {
    	   if (printer != null) { printer.setInputFile(ast.getFile()); }
    }

    /**
     * Default empty implementation.
     */
    @Override
    public void allProjectsDone() { 
    	if (printer != null) { 
    		//printer.printAllMessages();
    		printer.printToFile();
    	}
    }
}
