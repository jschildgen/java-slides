public class WitzeApp {
    private static WitzAPI api;

    public static void main(String[] args) {
        api = new MeineTestAPI();

        System.out.println("= Kategorien =");
        for(Kategorie k : api.getKategorien()) {
            System.out.println(k);
        }

        Kategorie k = api.getKategorien()[0];

        System.out.println();
        System.out.println("= Witze =");
        for(Witz w : api.getWitze(k)) {
            System.out.println(w.getWitz());
        }

        System.out.println();
        System.out.println("= Zufallswitz =");
        System.out.println(api.getZufallswitz().getWitz());
    }
}
