package de.othr.spezielleklassen;

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

    public final void erhoeheAlter() {
        this.alter++;
    }

    public static void main(String[] args) {
        de.othr.personen.Person p = new de.othr.personen.Person("Peter");
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
    static class Kreditkarte {
        enum TYP { VISA, MASTERCARD, AMEX }

        int kreditkartennr;
        de.othr.spezielleklassen.Kreditkarte.TYP typ;
        String cvc;
        //...
        public Kreditkarte() {}

        public Kreditkarte(int kreditkartennr, de.othr.spezielleklassen.Kreditkarte.TYP typ, String cvc) {
            this.kreditkartennr = kreditkartennr;
            this.typ = typ;
            this.cvc = cvc;
        }

        public int getKreditkartennr() {
            return kreditkartennr;
        }

        public void setKreditkartennr(int kreditkartennr) {
            this.kreditkartennr = kreditkartennr;
        }

        public de.othr.spezielleklassen.Kreditkarte.TYP getTyp() {
            return typ;
        }

        public void setTyp(de.othr.spezielleklassen.Kreditkarte.TYP typ) {
            this.typ = typ;
        }

        public String getCvc() {
            return cvc;
        }

        public void setCvc(String cvc) {
            this.cvc = cvc;
        }
    }

    class Adresse {
        private String strasse;
        private int hausnummer;
        private String plz;
        private String ort;

        public Adresse() {
        }

        public Adresse(String strasse, int hausnummer, String plz, String ort) {
            this.strasse = strasse;
            this.hausnummer = hausnummer;
            this.plz = plz;
            this.ort = ort;
        }

        public String getStrasse() {
            return strasse;
        }

        public void setStrasse(String strasse) {
            this.strasse = strasse;
        }

        public int getHausnummer() {
            return hausnummer;
        }

        public void setHausnummer(int hausnummer) {
            this.hausnummer = hausnummer;
        }

        public String getPlz() {
            return plz;
        }

        public void setPlz(String plz) {
            this.plz = plz;
        }

        public String getOrt() {
            return ort;
        }

        public void setOrt(String ort) {
            this.ort = ort;
        }
        //...
    }
}

