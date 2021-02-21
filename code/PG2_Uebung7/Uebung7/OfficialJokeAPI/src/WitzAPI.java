import java.io.IOException;

public interface WitzAPI {
    Witz getZufallswitz() throws IOException;
    Witz[] getWitze(Kategorie kategorie);
    Kategorie[] getKategorien();
}