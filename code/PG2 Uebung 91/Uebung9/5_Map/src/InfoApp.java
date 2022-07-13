import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;

public class InfoApp {
    public static void main(String[] args) {
        String home_dir = System.getProperty("user.home");
        Uebersetzer ue;
        try {
            ue = new Uebersetzer(Paths.get(home_dir, "deutsch.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            ue = new Uebersetzer();
        }

        System.out.printf("=== %s ===\n", ue.uebersetzen("Information"));

        System.out.printf("%s: %s\n", ue.uebersetzen("Operating System"), System.getProperty("os.name"));

        System.out.printf("%s: %s\n", ue.uebersetzen("Time"), new Date());
    }
}