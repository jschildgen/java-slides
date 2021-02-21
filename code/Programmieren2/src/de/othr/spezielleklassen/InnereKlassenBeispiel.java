package de.othr.spezielleklassen;

public class InnereKlassenBeispiel {
    public static void main(String[] args) {
        Person p = new Person("Peter");
        Person.Kreditkarte k = new Person.Kreditkarte();
        Person.Adresse a = p.new Adresse();
    }
}
