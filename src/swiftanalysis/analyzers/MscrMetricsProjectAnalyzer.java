package swiftanalysis.analyzers;

import swiftanalysis.AST;
import swiftanalysis.listeners.OverallMetricsListener;
import swiftanalysis.output.Printer;

/**
 * Analyzes projects using the OverallMetricsListener that is created by Marcel Rebouças.
 */
public class MscrMetricsProjectAnalyzer extends ListeningAnalyzer {

	
    /**
     * Creates a ListeningAnalyzer with Marcel's OverallMetricsListener.
     */
    public MscrMetricsProjectAnalyzer(Printer printer) {
        super(new OverallMetricsListener(printer), printer);
    }

    /**
     * Analyses each file using the given listener.
     *
     * @param ast the AST, contains file name, tree, and parser
     */
    @Override
    public void analyzeFile(AST ast) {
       	super.analyzeFile(ast);
       	System.out.print(".");
    }
    /**
     * Prints the summary when all projects are analysed.
     */
    @Override
    public void allProjectsDone() {
    	super.allProjectsDone();
        OverallMetricsListener.printSummary();
    }

}
