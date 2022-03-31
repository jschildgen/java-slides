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

class SubmitX {
    private static final String DEADLINE_TIME = "12:00:00+01:00";

    static void submit() throws IOException {
        ZonedDateTime now = ZonedDateTime.now();
        if(now.isAfter(getDeadline())) {
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
        if(!Files.exists(file)) {
            throw new IOException("Please write your token in "+file);
        }
        BufferedReader br = Files.newBufferedReader(file);
        String token = br.readLine();
        if(token.length() != 10) {
            throw new IOException("Invalid token in "+file);
        }
        return token;
    }

    static String getExercise() {
        Path path = Paths.get(System.getProperty("user.dir"));
        String a = path.getParent().getParent().getFileName().toString();
        String b = path.getParent().getFileName().toString();
        String c = path.getFileName().toString();
        return (a+"/"+b+"/"+c).replaceAll(" ", "_").replaceAll("%20", "_");
    }

    private static ZonedDateTime getDeadline() throws IOException {
        Path path = Paths.get(System.getProperty("user.dir")).getParent().getParent();
        Path file = path.resolve("course-info.yaml");
        BufferedReader br = Files.newBufferedReader(file);
        String line;
        while( (line = br.readLine()) != null) {
            if(line.startsWith("summary: ")) {
                Pattern pattern = Pattern.compile("([0-9]{4}\\-([0-9]){1,2}\\-([0-9]){1,2})");
                Matcher matcher = pattern.matcher(line);
                if(matcher.find()) {
                    return ZonedDateTime.parse(matcher.group(1)+"T"+DEADLINE_TIME);
                }
            }
        }
        return null;
    }
}
