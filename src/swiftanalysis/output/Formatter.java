package swiftanalysis.output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import swiftanalysis.output.messages.MetricMessage;

/**
 * Formatter used to display violation messages.
 * New formats can be added by extending this abstract base class.
 */
public abstract class Formatter {

	String extension;
	
    public Formatter(String extension) {
    	this.extension = extension;
    }

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
     public abstract void printToFile(String outputDirectoryPath, String fileName, List<MetricMessage> metricMessages);
     
    /**
     * Print progress info to the console if the format allows.
     *
     * @param str the string to print
     */
    public void printProgressInfo(String str) {
        System.out.print(str);
    }
    
    public void writeToFile(String path, String data) throws IOException {
    	Path file = Paths.get(path);
    	Files.write(file, data.getBytes());
    }

    
}
