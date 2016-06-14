package swiftanalysis.output;

import java.util.List;

import swiftanalysis.output.messages.MetricMessage;

/**
 * Formatter used to display violation messages.
 * New formats can be added by extending this abstract base class.
 */
public abstract class Formatter {

	private String extension;
	
    public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Formatter(String extension) {
    	this.extension = extension;
    }
    
    public abstract String getFormattedMessages(List<MetricMessage> metricMessages);
    
}
