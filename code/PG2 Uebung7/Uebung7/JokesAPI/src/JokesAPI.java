import java.io.IOException;

public class JokesAPI implements WitzAPI {
    @Override
    public Witz getZufallswitz() throws IOException {
        String json = APIHelper.httpGet("https://daily-jokes.herokuapp.com/api");
        String frage = APIHelper.parseJson(json).getString("question");
        String antwort = APIHelper.parseJson(json).getString("answer");
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
