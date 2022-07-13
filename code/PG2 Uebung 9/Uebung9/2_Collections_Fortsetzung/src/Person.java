import java.util.*;

public class Person {
    private String name;
    private Set<String> hobbies;
    private List<String> wohnorte;
    private Map<String, String> telefon;

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

    @Override
    public String toString() {
        return String.format("name: %s\n" +
                "hobbies: %s\n" +
                "wohnorte: %s\n" +
                "telefon: %s",
                name,
                hobbies.stream().map(s -> "\n    - "+s).reduce((s,t)->s+t).orElse(""),
                wohnorte.stream().map(s -> "\n    - "+s).reduce((s,t)->s+t).orElse(""),
                telefon.entrySet().stream().map(e -> "\n    "+e.getKey()+": "+e.getValue()).reduce((s,t)->s+t).orElse("")
        );
    }
}