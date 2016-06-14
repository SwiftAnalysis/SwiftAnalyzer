package swiftanalysis.output;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import swiftanalysis.output.messages.Messages;
import swiftanalysis.output.messages.MetricMessage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Formatter that displays violation messages in valid JSON output.
 */
public final class JSONFormatter extends Formatter {

	public JSONFormatter() {
		super(".json");
	}

	private static final Gson GSON = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();

	@Override
	public void displayMetricMessages(List<MetricMessage> metricMessages) {
		try {
			Map<String, Object> messages = generateOutput(metricMessages);
			System.out.println(GSON.toJson(messages));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Map<String, Object> generateOutput(List<MetricMessage> metricMessages) throws IOException {

		List<Map<String, Object>> messages = new ArrayList<>();

		for (MetricMessage msg : metricMessages) {
			Map<String, Object> metric = new HashMap<>();
			Map<String, Integer> location = new HashMap<>();

			location.put(Messages.KEY_LINE, msg.getLineNumber());
			if (msg.getColumnNumber() != 0) {
				location.put(Messages.KEY_COLUMN, msg.getColumnNumber());
			}

			metric.put(Messages.KEY_TYPE, msg.getType().getName());
			metric.put(Messages.KEY_SOURCE_FILE, msg.getFilePath());
			metric.put(Messages.KEY_LOCATION, location);
			metric.put(Messages.KEY_MESSAGE, msg.getMessage());

			messages.add(metric);
		}

		Map<String, Object> output = new HashMap<>();
		output.put(Messages.KEY_METRICS, messages);
		
		return output;
	}

	@Override
	public void printProgressInfo(String str) {
		// Not Applicable to this formatter
	}

	@Override
	public void printToFile(String outputDirectoryPath, String fileName, List<MetricMessage> metricMessages) {
		try {
			
			Map<String, Object> messages = generateOutput(metricMessages);
			String path = outputDirectoryPath + File.separator + fileName + this.extension;
			
			super.writeToFile(path, GSON.toJson(messages));
			System.out.println("JSON file successfully generated at "+path);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
