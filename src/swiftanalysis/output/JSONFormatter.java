package swiftanalysis.output;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import swiftanalysis.output.messages.MessageInterface;
import swiftanalysis.output.messages.Messages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Formatter that displays messages in a valid JSON output.
 */
public final class JSONFormatter extends Formatter {

	private static final Gson GSON = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();

	public JSONFormatter() {
		super(".json");
	}

	@Override
	public String getFormattedMessages(List<MessageInterface> metricMessages) {
		try {
			Map<String, Object> messages = generateOutput(metricMessages);
			return GSON.toJson(messages);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "";
	}

	private Map<String, Object> generateOutput(List<MessageInterface> metricMessages) throws IOException {

		List<Map<String, Object>> messages = new ArrayList<>();

		for (MessageInterface msg : metricMessages) {
			messages.add(msg.toStringObjectMap());
		}

		Map<String, Object> output = new HashMap<>();
		output.put(Messages.KEY_METRICS, messages);
		
		return output;
	}
}
