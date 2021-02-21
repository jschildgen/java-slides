package de.othr.personenadresse;

public class Person {
    private String name;
    private int alter;
    private Adresse adresse;
    
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int erhoeheAlter() {
        this.alter++;
        return this.alter;
    }

    public int erhoeheAlter(int jahre) {
        this.alter += jahre;
        return this.alter;
    }

    public int erhoeheAlter(short jahre) {
        this.alter += jahre;
        System.out.println("Alterserhöhung um nur "+jahre+" Jahre.");
        return this.alter;
    }

    public void setName(String vorname, String nachname) {
        this.name = vorname + " " + nachname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public static void main(String[] args) {
        Person p = new Person("Peter");
        Person q = new Person("Ute");

        p.setAlter(20);

        p.erhoeheAlter();
        int neuesAlter = p.erhoeheAlter();

        System.out.println(p.getName()+" ist nun " +
                neuesAlter+" Jahre alt.");

        Adresse a = new Adresse("Badstr.", 3, "12345", "Teststadt");

        p.setAdresse(a);
        q.setAdresse(a);

        if(p.getAdresse() == q.getAdresse()) {
            System.out.println(p.getName()+" und "+q.getName()
                    +" haben dieselbe Adresse.");
        }

        p.getAdresse().setHausnummer(5);
        System.out.println(q.getName()+" wohnt in der Hausnummer "
                +q.getAdresse().getHausnummer());





        p.erhoeheAlter(2); // erhoeheAlter(int)
        short x = 3;
        p.erhoeheAlter(x); // erhoeheAlter(short)
    }
}
