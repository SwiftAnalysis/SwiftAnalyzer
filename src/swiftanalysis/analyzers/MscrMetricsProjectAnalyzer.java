package swiftanalysis.analyzers;

import swiftanalysis.AST;
import swiftanalysis.listeners.MscrMetricsListener;

/**
 * Analyzes projects using the MscrMetricsListener that is created by Marcel Rebouças.
 */
public class MscrMetricsProjectAnalyzer extends ListeningAnalyzer {

    /**
     * Creates a ListeningAnalyzer with Marcel's MscrMetricsListener.
     */
    public MscrMetricsProjectAnalyzer() {
        super(new MscrMetricsListener());
    }

    /**
     * Analyses each file using the given listener.
     *
     * @param ast the AST, contains file name, tree, and parser
     */
    @Override
    protected void analyzeFile(AST ast) {
       	super.analyzeFile(ast);
       	System.out.print(".");
    }
    /**
     * Prints the summary when all projects are analysed.
     */
    @Override
    public void allProjectsDone() {
        MscrMetricsListener.printSummary();
    }

}
