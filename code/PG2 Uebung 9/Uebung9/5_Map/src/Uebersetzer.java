import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Uebersetzer {
    private Map<String, String> woerterbuch = new HashMap<>();

    public Uebersetzer() {
    }

    public Uebersetzer(Path sprachdatei) throws IOException {
        BufferedReader br = Files.newBufferedReader(sprachdatei);
        String zeile;
        String[] teile;
        while((zeile = br.readLine()) != null) {
            teile = zeile.split("\\|");
            if(teile.length != 2) {
                throw new IOException("Ungueltige Zeile im Woerterbuch: "+zeile);
            }
            woerterbuch.put(teile[0], teile[1]);
        }
    }

    public String uebersetzen(String s) {
        if(woerterbuch.containsKey(s)) {
            return woerterbuch.get(s);
        }
        return s;
    }
}
