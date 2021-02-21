package de.othr;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class MeinProgramm {
  public static void main(String[] args) {
    JSONParser parser = new JSONParser();
    String json = "{\"vorname\":\"Ute\",\"nachname\":\"Li\"}";
    try {
        Object obj = parser.parse(json);
        JSONObject data = (JSONObject)obj;
        System.out.println("Hallo "+data.get("vorname"));
    } catch (ParseException e) {
        System.out.println("Ungültiger JSON-String.");
        System.out.println("Position "+e.getPosition());
        return;
    }
  }
}
