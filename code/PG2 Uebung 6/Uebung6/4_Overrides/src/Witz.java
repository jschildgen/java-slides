public class Witz {
    private String witz;
    protected Kategorie kategorie;

    public Witz(String witz) {
        this.witz = witz;
    }

    public Witz(String witz, Kategorie kategorie) {
        this.witz = witz;
        this.kategorie = kategorie;
    }

    public String getWitz() {
        return witz;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }
}