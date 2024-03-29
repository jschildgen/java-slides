import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;

public class ChuckNorrisAPI implements WitzAPI {
    @Override
    public Witz getZufallswitz() throws IOException {
        String json = APIHelper.httpGet("http://api.icndb.com/jokes/random");
        String witz = ((JSONObject)(APIHelper.parseJson(json).get("value"))).getString("joke");
        return new Witz(witz);
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
