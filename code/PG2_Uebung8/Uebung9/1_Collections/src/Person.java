import java.util.*;

public class Person {
    private String name;
    private Set<String> hobbies;
    private List<String> wohnorte;
    private Map<String, String> telefon;

    public Person() {
        name = "Katja";

        hobbies = new HashSet<>();
        wohnorte = new ArrayList<>();
        telefon = new HashMap<>();

        hobbies.add("Tennis");
        hobbies.add("Klavier");

        wohnorte.add("Regensburg");
        wohnorte.add("Berlin");

        telefon.put("Mobil", "0151/55");
        telefon.put("Privat", "0941/55");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getWohnorte() {
        return wohnorte;
    }

    public void setWohnorte(List<String> wohnorte) {
        this.wohnorte = wohnorte;
    }

    public Map<String, String> getTelefon() {
        return telefon;
    }

    public void setTelefon(Map<String, String> telefon) {
        this.telefon = telefon;
    }
}