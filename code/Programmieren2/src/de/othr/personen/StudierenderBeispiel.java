package de.othr.personen;

public class StudierenderBeispiel {
    public static void main(String[] args) {
        Person p = new Person("Peter");
        Studierender s = new Studierender("Jim", 123456);
        Person q = new Studierender("Ute", 123457);

        System.out.printf("%s (Matrikelnr: %d)\n",
                s.getName(), s.getMatrikelnr());
        System.out.printf("%s (Matrikelnr: %d)\n",
                q.getName(), ((Studierender)(q)).getMatrikelnr());

        if(werIstAelter(p, q) > 1) {
            System.out.println("Peter ist älter als Ute.");
        }
    }






















    /**
     * Vergleicht, welche Person älter ist
     * @param p1 Erste Person
     * @param p2 Zweite Person
     * @return 1, wenn die erste Person älter als die zweite ist
     *        -1, wenn die erste Person jünger als die zweite ist
     */
    public static int werIstAelter(Person p1, Person p2) {
        return p1.getAlter() > p2.getAlter() ? 1 : -1;
    }
}
