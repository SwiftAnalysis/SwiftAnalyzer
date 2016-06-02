package swiftanalysis.analyzers;

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
     * Prints the summary when all projects are analysed.
     */
    @Override
    public void allProjectsDone() {
        MscrMetricsListener.printSummary();
    }

}
