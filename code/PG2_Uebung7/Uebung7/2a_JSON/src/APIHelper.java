import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class APIHelper {

    private static ScriptEngineManager sem = new ScriptEngineManager();
    private static ScriptEngine engine = sem.getEngineByName("javascript");

    public static String httpGet(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn =
                (HttpURLConnection) url.openConnection();

        // Buffer the result into a string
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();

        conn.disconnect();
        return sb.toString();
    }

    public static Map<String, Object> parseJson(String json) {
        try {
            Object data = engine.eval("Java.asJSONCompatible(" + json + ")");
            return (Map<String, Object>) data;
        } catch (ScriptException | ClassCastException e) {
            throw new IllegalArgumentException("Ungueltiges JSON-Objekt");
        }
    }
}