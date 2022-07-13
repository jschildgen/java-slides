public class Karte {
    enum FARBE { SCHWARZ, ROT }

    private FARBE farbe;
    private int wert;

    public Karte() {
    }

    public Karte(FARBE farbe, int wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    public FARBE getFarbe() {
        return farbe;
    }

    public void setFarbe(FARBE farbe) {
        this.farbe = farbe;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }
}