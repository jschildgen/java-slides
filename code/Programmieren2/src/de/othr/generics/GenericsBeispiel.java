package de.othr.generics;

public class GenericsBeispiel {
    public static void main(String[] args) {

        Paar<String> name = new Paar<String>("Ute", "Meyer");
        System.out.println("Vorname: "+name.getErster());
        System.out.println("Nachname: "+name.getZweiter());

        Paar<Double> koordinaten = new Paar<Double>(0.0, 0.0);
        koordinaten.setErster(49.017222);
        koordinaten.setZweiter(12.096944);
        System.out.println("N"+koordinaten.getErster());
        System.out.println("O"+koordinaten.getZweiter());

        Paar<String> p = new Paar<String>("Peter", "Müller");
        Paar<Paar<String>> brautpaar = new Paar<Paar<String>>(name, p);
        System.out.printf("%s heiratet %s\n",
                brautpaar.getErster().getErster(),
                brautpaar.getZweiter().getErster());

        var ute = new SchluesselWertPaar<String, Integer>("Ute", 19);

        name = new Paar<>("Ute", "Meyer");

        Studierender s1 = new Studierender("Jim", 123456);
        s1.setAlter(30);
        Studierender s2 = new Studierender("Ute", 123457);
        s2.setAlter(25);
        Studierender s3 = werIstAelter(s1, s2);
        mehrKram();
    }
    public static <T extends Person> T werIstAelter(T p1, T p2) {
        if(p1.getAlter() >= p2.getAlter()) {
            return p1;
        } else {
            return p2;
        }
    }

    public static void printPaar(Paar<?> paar) {
        System.out.println(paar.getErster()+", "+paar.getZweiter());
    }

    public static int altersunterschied(Paar<? extends Person> paar) {
        return Math.abs(paar.getErster().getAlter()
                       -paar.getZweiter().getAlter());
    }

    public static void peterfizieren(Paar<? super Person> paar) {
        paar.setZweiter(new Person("Peter"));
    }

    public static void mehrKram() {
        var brautpaar = new Paar<>(new Person("Ute"), new Person("Jim"));
        System.out.println(altersunterschied(brautpaar));
        peterfizieren(brautpaar);
    }





}
