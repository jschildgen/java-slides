public class MeineTestAPI implements WitzAPI {

    private static final Kategorie[] KATEGORIEN = { new Kategorie("Essen"), new Kategorie("Trinken") };

    @Override
    public Witz getZufallswitz() {
        return new Witz("Geht ein Mathematiker an der Kneipe vorbei.", KATEGORIEN[1]);
    }

    @Override
    public Witz[] getWitze(Kategorie kategorie) {
        Witz[] witze = {new FrageAntwortWitz("Wo geht ein Wal essen?", "Ins Wallokal"),
                        new Witz("Brechstangen werden aus Diebstahl gefertigt.")};
        return witze;
    }

    @Override
    public Kategorie[] getKategorien() {
        return KATEGORIEN;
    }
}