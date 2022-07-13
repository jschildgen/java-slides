import java.io.IOException;

public class WitzeApp {
    private static WitzAPI api;

    public static void main(String[] args) {
        api = new ChuckNorrisAPI();

        try {
            System.out.println(api.getZufallswitz().getWitz());
        } catch (IOException e) {
            System.out.println("API-Fehler");
        }
    }
}
