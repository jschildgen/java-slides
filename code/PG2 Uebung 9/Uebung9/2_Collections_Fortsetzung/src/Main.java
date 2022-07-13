import java.util.*;

public class Main {

    private static Person p = new Person();
    public static void main(String[] args) {
        p.setName("Katja");

        Set<String> hobbies = new HashSet<>();
        List<String> wohnorte = new ArrayList<>();
        Map<String, String> telefon = new HashMap<>();

        hobbies.add("Tennis");
        hobbies.add("Klavier");

        wohnorte.add("Regensburg");
        wohnorte.add("Berlin");

        telefon.put("Mobil", "0151/55");
        telefon.put("Privat", "0941/55");

        p.setHobbies(hobbies);
        p.setWohnorte(wohnorte);
        p.setTelefon(telefon);

        System.out.println(p);
    }

    public static Person getP() {
        return p;
    }
}
