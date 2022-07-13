import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task {
    public static void main(String[] args) {
        System.out.println("Token: " + getToken());
    }

    public static String getToken() {
        Path file = Paths.get(System.getProperty("user.home"), "submitpg2.txt");
        if (!Files.exists(file)) {
            return null;
        }
        BufferedReader br = null;
        try {
            br = Files.newBufferedReader(file);
            String token = br.readLine();
            return token;
        } catch (IOException e) {
            return null;
        }
    }


}