package com.company;

public class Person {

    private static int next_persNr = 1;

    private int persNr;
    private String name = "Namenlos";
    private int alter;

    public Person() {
        persNr = next_persNr;
        next_persNr++;
        alter = 55;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String vorname, String nachname) {
        this(vorname+" "+nachname);
    }

    public Person(int alter) {
        this.alter = alter;
    }

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        if(name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getAlter() {
        return this.alter;
    }

    public int getPersNr() {
        return persNr;
    }

    public void erhoeheAlter() {
        this.erhoeheAlter(1);
    }

    public void erhoeheAlter(int jahre) {
        this.alter += jahre;
    }


    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = new Person(this.name);
        p.alter = this.alter;
        return p;
    }

    @Override
    public boolean equals(Object obj) {
        Person other = (Person)obj;
        return this.name.equals(other.name);
    }

}
