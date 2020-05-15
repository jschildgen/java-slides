package de.othr.generics;

public class Person implements Comparable<Person> {
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
    //...
    @Override
    public int compareTo(Person person) {
        return this.alter-person.alter;
    }
}
