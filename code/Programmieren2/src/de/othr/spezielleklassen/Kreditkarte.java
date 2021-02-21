package de.othr.spezielleklassen;

public final class Kreditkarte {
    enum TYP { VISA, MASTERCARD, AMEX }

    int kreditkartennr;
    TYP typ;
    String cvc;

    public Kreditkarte(int kreditkartennr, TYP typ, String cvc) {
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

    public TYP getTyp() {
        return typ;
    }

    public void setTyp(TYP typ) {
        this.typ = typ;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
}
