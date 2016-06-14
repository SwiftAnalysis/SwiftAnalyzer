package swiftanalysis.output;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import swiftanalysis.common.Location;
import swiftanalysis.output.messages.MetricMessage;

/**
 * Generates and outputs formatted analysis messages.
 */
public final class Printer implements Comparable<Printer> {

	private final String outputFileName = "SwiftAnalyzerOutput";
	
	private File inputFile;
	private String outputFileDirectory;
	private Formatter formatter;
	private List<MetricMessage> msgBuffer = new ArrayList<>();

	/**
	 * Constructs a printer for the specified input file, maximum severity, and color setting.
	 *
	 * @param inputFile The source file to verify
	 * @param formatter Format to print in
	 */
	public Printer(File inputFile, Formatter formatter) {
		this.inputFile = inputFile;
		this.formatter = formatter;
	}

	/**
	 * Constructs a printer for the specified input file, maximum severity, and color setting.
	 *
	 * @param inputFile The source file to verify
	 * @param formatter Format to print in
	 */
	public Printer(Formatter formatter) {
		this.formatter = formatter;
	}
	
	public void setInputFile(File file){
		this.inputFile = file;
	}
	
	public File getInputFile(){
		return this.inputFile;
	}
	
	public String getOutputFileDirectory() {
		return outputFileDirectory;
	}

	public void setOutputFileDirectory(String outputFileDirectory) {
		this.outputFileDirectory = outputFileDirectory;
	}
	
	/**
	 * Prints the message to the output source.
	 *
	 * @param type Type associated with the metric
	 * @param location Location object containing line and column number for printing
	 * @param message Message to print
	 */

	public void addToPrinting(MetricType type, Location location, String message) {
		print(type, location, message);
	}

	public List<MetricMessage> getMetricMessages() {
		return msgBuffer;
	}

	/**
	 * Calls formatter to display all violation or error messages.
	 *
	 * @throws IOException if formatter cannot retrieve canonical path from inputFile
	 */
	public void printAllMessages() {
		String outputData = formatter.getFormattedMessages(msgBuffer);
		System.out.println(outputData);
	}
	
    public void printToFile() {
    	
    	String outputData = formatter.getFormattedMessages(msgBuffer);
    	String path = outputFileDirectory + File.separator + outputFileName + formatter.getExtension();
    	
    	Path file = Paths.get(path);
    	
    	try {
			Files.write(file, outputData.getBytes());
			System.out.println("Succesfully generated output file at "+path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int compareTo(Printer printer) {
		return this.inputFile.compareTo(printer.inputFile);
	}

	@Override
	public boolean equals(Object printerObject) {
		if (!(printerObject instanceof Printer)) {
			return false;
		}
		return this.inputFile.equals(((Printer) printerObject).inputFile);
	}

	@Override
	public int hashCode() {
		assert false : "hashCode not designed";
	return 100;
	}

	public void print(MetricType type, Location location, String msg) {
		MetricMessage metricMessage = new MetricMessage(type,location.line, location.column, msg);
		addToMsgBuffer(metricMessage);
	}

	private void addToMsgBuffer(MetricMessage metricMessage) {
		try {
			metricMessage.setFilePath(this.inputFile.getCanonicalPath());
		} catch (IOException e) {
			System.err.println("Error in getting canonical path of input file: " + e.getMessage());
		}
		this.msgBuffer.add(metricMessage);
	}

}
