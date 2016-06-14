package swiftanalysis.analyzers;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import swiftanalysis.AST;

/**
 * Analyzer that can be given a ParseTreeListener to analyze projects.
 */
public class ListeningAnalyzer extends ProjectAnalyzer {

    /**
     * The listener
     */
    private ParseTreeListener listener;

    /**
     * Constructs the project analyzer with the given listener.
     *
     * @param listener the parse tree listener
     */
    public ListeningAnalyzer(ParseTreeListener listener) {
        this.listener = listener;
    }

    /**
     * Analyses each file using the given listener.
     *
     * @param ast the AST, contains file name, tree, and parser
     */
    @Override
    protected void analyzeFile(AST ast) {
    	
        if (printer != null) { printer.setInputFile(ast.getFile()); }
        
        ParseTreeWalker.DEFAULT.walk(listener, ast.getTree());
    }
}
