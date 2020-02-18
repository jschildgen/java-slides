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
            System.out.println(p.getName()+" und "+q.getName()+" haben die selbe Adresse.");
        }
    }
}
