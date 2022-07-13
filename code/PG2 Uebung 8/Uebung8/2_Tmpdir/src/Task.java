import java.nio.file.Path;
import java.nio.file.Paths;

public class Task {
    public static void main(String[] args) {
        System.out.println(getTmpdir());
    }

    public static Path getTmpdir() {
        return Paths.get(System.getProperty("java.io.tmpdir"));
    }
}