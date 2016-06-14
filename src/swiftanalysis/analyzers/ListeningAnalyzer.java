package swiftanalysis.analyzers;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import swiftanalysis.AST;
import swiftanalysis.output.Printer;

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
    public ListeningAnalyzer(ParseTreeListener listener, Printer printer) {
    	super(printer);
        this.listener = listener;
    }

    /**
     * Analyses each file using the given listener.
     *
     * @param ast the AST, contains file name, tree, and parser
     */
    @Override
    public void analyzeFile(AST ast) {
    	super.analyzeFile(ast);
        ParseTreeWalker.DEFAULT.walk(listener, ast.getTree());
    }
}
