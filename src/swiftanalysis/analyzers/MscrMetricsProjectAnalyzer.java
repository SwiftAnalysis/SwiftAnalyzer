package swiftanalysis.analyzers;

import swiftanalysis.listeners.MscrMetricsListener;

public class MscrMetricsProjectAnalyzer extends ListeningAnalyzer {

    public MscrMetricsProjectAnalyzer() {
        super(new MscrMetricsListener());
    }

    @Override
    public void allProjectsDone() {
        MscrMetricsListener.printSummary();
    }

}
