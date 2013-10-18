package poker.AI.parser;

import com.google.gson.Gson;

public class JSONParser {
	private final Gson gson = new Gson();

	public <T> T parse(String s, Class<T> cls) {
		return gson.fromJson(s, cls);
	}
}
