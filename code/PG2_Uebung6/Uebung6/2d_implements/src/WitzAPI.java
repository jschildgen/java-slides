public interface WitzAPI {
    Witz getZufallswitz();
    Witz[] getWitze(Kategorie kategorie);
    Kategorie[] getKategorien();
}