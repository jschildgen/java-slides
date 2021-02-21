package de.othr.lebewesen;

public class Person extends Lebewesen {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("Peter");
        p.setAlter(20);
        p.erhoeheAlter();
        System.out.println(p.getName()+" ist nun " +
                p.getAlter()+" Jahre alt.");
    }

    public Person() {
    }

    public Person(int alter) {
        this();
        this.alter = alter;
    }

    public Person(String vorname, String nachname) {
        this(vorname+" "+nachname);
    }

    @Override
    public String getDetails() {
        return null;
    }
}