package de.othr.personenadresse;

public class Adresse {
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

    @Override
    public String toString() {
        return strasse+" "+hausnummer+", "+plz+" "+ort;
    }
    //...
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Adresse) {
            Adresse other = (Adresse) obj;
            if(this.strasse.equals(other.strasse)
                && this.hausnummer==other.hausnummer
                && this.plz.equals(other.plz)
                && this.ort.equals(other.ort))
            {
                return true;
            }
        }
        return false;
    }
}
