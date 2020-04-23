package de.othr.lebewesen;

public class LebewesenBeispiel {
    public static void main(String[] args) {
        Person q = new Studierender("Ute", 123457);

        if(q instanceof Studierender) {
            System.out.println(q.getName()+" studiert.");
        }

        if(q instanceof Lebewesen) {
            System.out.println(q.getName()+" lebt.");
        }
    }
}
