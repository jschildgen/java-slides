import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String html = null;
        try {
        html = APIHelper.httpGet("http://www.example.com");
        System.out.println(html);
        } catch (IOException e) {
            System.out.println("Verbindungsfehler");
        }
    }
}
