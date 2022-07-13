import java.util.Random;

public class Karte {
    enum FARBE { SCHWARZ, ROT }

    private FARBE farbe;
    private int wert;

    public Karte() {
        Random random = new Random();
        random.nextInt(7,11);
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

    @Override
    public String toString() {
        String farbe = this.farbe == FARBE.ROT ? "Rote"
                       : "Schwarze";
        return String.format("%s %d", farbe, wert);
    }
}