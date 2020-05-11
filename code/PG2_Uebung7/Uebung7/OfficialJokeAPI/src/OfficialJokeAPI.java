import java.io.IOException;

public class OfficialJokeAPI implements WitzAPI {
    @Override
    public Witz getZufallswitz() throws IOException {
        String json = APIHelper.httpGet("https://official-joke-api.appspot.com/random_joke");
        String frage = (String)(APIHelper.parseJson(json).get("setup"));
        String antwort = (String)(APIHelper.parseJson(json).get("punchline"));
        return new FrageAntwortWitz(frage, antwort);
    }

    @Override
    public Witz[] getWitze(Kategorie kategorie) {
        return new Witz[0];
    }

    @Override
    public Kategorie[] getKategorien() {
        return new Kategorie[0];
    }
}
