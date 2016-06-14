package swiftanalysis.output;

import java.io.IOException;
import java.util.List;

import swiftanalysis.output.messages.MetricMessage;

/**
 * Formatter used to display violation messages.
 * New formats can be added by extending this abstract base class.
 */
public abstract class Formatter {

    public Formatter() {}

    /**
     * Print all metric messages for a given file to the console.
     *
     * @param metricMessages list of metric messages to print
     * @throws IOException if canonical path could not be retrieved from the inputFile
     */
    public abstract void displayMetricMessages(List<MetricMessage> metricMessages);
    
    /**
     * Print all metric messages for to a file.
     *
     * @param metricMessages list of metric messages to print
     * @throws IOException if canonical path could not be retrieved from the inputFile
     */
     public abstract void printToFile(List<MetricMessage> metricMessages);
     
    /**
     * Print progress info to the console if the format allows.
     *
     * @param str the string to print
     */
    public void printProgressInfo(String str) {
        System.out.print(str);
    }

    
}
