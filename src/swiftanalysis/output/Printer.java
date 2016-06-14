package swiftanalysis.output;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import swiftanalysis.common.Location;
import swiftanalysis.output.messages.MetricMessage;

/**
 * Generates and outputs formatted analysis messages.
 */
public final class Printer implements Comparable<Printer> {

	private File inputFile;
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
		formatter.displayMetricMessages(msgBuffer);
	}
	
    public void printToFile() {
		formatter.printToFile(msgBuffer);
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
		MetricMessage violationMessage = new MetricMessage(type,location.line, location.column, msg);
		addToMsgBuffer(violationMessage);
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
