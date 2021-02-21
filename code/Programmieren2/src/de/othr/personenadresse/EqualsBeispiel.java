package de.othr.personenadresse;

public class EqualsBeispiel {
    public static void main(String[] args) {
        Person p = new Person("Peter");
        Person q = new Person("Ute");

        p.setAdresse(new Adresse("Badstr.", 3, "12345", "Teststadt"));
        q.setAdresse(new Adresse("Badstr.", 3, "12345", "Teststadt"));

        if(p.getAdresse() == q.getAdresse()) {
            System.out.println("Die Adresse ist dieselbe.");
        } else {
            System.out.println("Die Adresse ist nicht dieselbe.");
        }

        if(p.getAdresse().equals(q.getAdresse())) {
            System.out.println("Die Adresse ist die gleiche.");
        } else {
            System.out.println("Die Adresse ist nicht die gleiche.");
        }

        Adresse a = new Adresse("Badstr.", 3, "12345", "Teststadt");
        p.setAdresse(a);
        q.setAdresse(a);

    }
}
