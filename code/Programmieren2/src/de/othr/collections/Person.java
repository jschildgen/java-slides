package de.othr.collections;

import java.util.Objects;

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

    //...
    @Override
    public boolean equals(Object o) {
        if(this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person p = (Person) o;
        if(this.name.equals(p.name)
                && this.alter == p.alter) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, alter);
    }
}
