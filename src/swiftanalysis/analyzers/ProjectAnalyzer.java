package swiftanalysis.analyzers;

import swiftanalysis.AST;
import swiftanalysis.output.Printer;

import java.io.File;
import java.util.stream.Stream;

/**
 * Base analyzer that analyses file by file.
 */
public abstract class ProjectAnalyzer implements Analyzer {

	public Printer printer; 
	
    /**
     * Calls analyzeFile for each file.
     *
     * @param projectPath project directory
     * @param astStream stream of ASTs
     */
    public void analyzeProject(File projectPath, Stream<AST> astStream) {
        System.out.println("#");
        System.out.println("# Project: " + projectPath.getAbsolutePath());
        System.out.println("#");
        astStream.forEach(this::analyzeFile);   
    }

    /**
     * Called for each file. Implement this to analyze a file ASTs.
     *
     * @param ast the AST, contains file name, tree, and parser
     */
    protected abstract void analyzeFile(AST ast);

    /**
     * Default empty implementation.
     */
    @Override
    public void allProjectsDone() { 
    	if (printer != null) { 
    		printer.printAllMessages();
    		//printer.printToFile();
    	}
    }
}
