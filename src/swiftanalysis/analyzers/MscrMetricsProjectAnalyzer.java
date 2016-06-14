package swiftanalysis.analyzers;

import swiftanalysis.AST;
import swiftanalysis.listeners.MscrMetricsListener;
import swiftanalysis.output.Printer;

/**
 * Analyzes projects using the MscrMetricsListener that is created by Marcel Rebouças.
 */
public class MscrMetricsProjectAnalyzer extends ListeningAnalyzer {

	
    /**
     * Creates a ListeningAnalyzer with Marcel's MscrMetricsListener.
     */
    public MscrMetricsProjectAnalyzer(Printer printer) {
        super(new MscrMetricsListener(printer), printer);
    }

    /**
     * Analyses each file using the given listener.
     *
     * @param ast the AST, contains file name, tree, and parser
     */
    @Override
    protected void analyzeFile(AST ast) {
       	super.analyzeFile(ast);
    }
    /**
     * Prints the summary when all projects are analysed.
     */
    @Override
    public void allProjectsDone() {
    	super.allProjectsDone();
        MscrMetricsListener.printSummary();
    }

}
