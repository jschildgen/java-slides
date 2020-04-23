package de.othr.overriding;

public class Person {
    private String name;
    private int alter;

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

    public void erhoeheAlter() {
        this.alter++;
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

    public String getDetails() {
        return String.format("%s (%d)", this.name, this.alter);
    }

    @Override
    public String toString() {
        return this.getDetails();
    }
}
