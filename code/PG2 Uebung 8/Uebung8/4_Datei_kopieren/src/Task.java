import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task {
    public static void main(String[] args) {
        Path orig = getTmpdir().resolve("zahlen.txt");
        Path newFile = getTmpdir().resolve("zahlen2.txt");
        try {
            Files.copy(orig, newFile);
        } catch (IOException e) {
            System.out.println("Konnte Datei nicht kopieren.");
        }
    }

    private static Path getTmpdir() {
        return Paths.get(System.getProperty("java.io.tmpdir"));
    }
}