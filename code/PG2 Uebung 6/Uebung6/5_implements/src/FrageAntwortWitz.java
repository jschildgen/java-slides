public class FrageAntwortWitz extends Witz {
    private String frage;
    private String antwort;

    public FrageAntwortWitz(String frage, String antwort) {
        super(null);
        this.frage = frage;
        this.antwort = antwort;
    }

    public FrageAntwortWitz(String frage, String antwort, Kategorie kategorie) {
        super(null, kategorie);
        this.frage = frage;
        this.antwort = antwort;
    }

    public String getFrage() {
        return frage;
    }

    public String getAntwort() {
        return antwort;
    }

    @Override
    public String getWitz() {
        return this.frage+" "+this.antwort;
    }
}