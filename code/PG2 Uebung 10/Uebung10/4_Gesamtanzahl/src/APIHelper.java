import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class APIHelper {
    public static List<String> httpGetList(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn =
                (HttpURLConnection) url.openConnection();

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = rd.readLine()) != null) {
            lines.add(line);
        }
        rd.close();

        conn.disconnect();
        return lines;
    }
}
