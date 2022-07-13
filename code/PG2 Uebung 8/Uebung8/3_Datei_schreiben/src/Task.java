import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Task {
    public static void main(String[] args) {
        try(BufferedWriter bw = Files.newBufferedWriter(getTmpdir().resolve("zahlen.txt"),
                StandardOpenOption.CREATE)) {
            for(int i = 1; i <= 5; i++) {
                bw.write(i+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Path getTmpdir() {
        return Paths.get(System.getProperty("java.io.tmpdir"));
    }
}