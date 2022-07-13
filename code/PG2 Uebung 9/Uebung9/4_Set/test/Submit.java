import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Submit {
    private static final String DEADLINE_TIME = "12:00:00+01:00";
    private static final ZonedDateTime DEADLINE = ZonedDateTime.parse("2022-05-26" + "T" + DEADLINE_TIME);

    static void submit() throws IOException {
        ZonedDateTime now = ZonedDateTime.now();
        if (now.isAfter(DEADLINE)) {
            return;
        }
        URL url = new URL("https://fraage.de/submitpg2/submit.php?s=" + getStudent() + "&e=" + getExercise());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("accept", "text/plain");
        int responseCode = connection.getResponseCode();

        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new IOException("HTTP_" + responseCode);
        }
    }

    private static String getStudent() throws IOException {
        Path file = Paths.get(System.getProperty("user.home"), "submitpg2.txt");
        if (!Files.exists(file)) {
            throw new IOException("Please write your token in " + file);
        }
        BufferedReader br = Files.newBufferedReader(file);
        String token = br.readLine();
        if (token.length() != 10) {
            throw new IOException("Invalid token in " + file);
        }
        return token;
    }

    static String getExercise() {
        Path path = Paths.get(System.getProperty("user.dir"));
        String b = path.getParent().getFileName().toString();
        String c = path.getFileName().toString();
        return (b + "/" + c).replaceAll(" ", "_").replaceAll("%20", "_");
    }
}