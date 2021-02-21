public class WitzeApp {
    private static WitzAPI api;

    public static void main(String[] args) {
        Witz witz;

        Kategorie essen = new Kategorie("Essen");
        witz = new Witz("Herr Ober, da ist ein H in meiner Buchstabensuppe!", essen);

        System.out.println("Kategorie: "+witz.getKategorie());
        System.out.println(witz.getWitz());
    }
}
