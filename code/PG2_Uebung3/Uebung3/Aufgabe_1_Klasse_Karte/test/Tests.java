import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testSolution() {
        Assert.assertEquals("Es soll nur die Farben ROT und SCHWARZ geben.", 2, Karte.FARBE.values().length);

        Karte k1 = new Karte();
        k1.setFarbe(Karte.FARBE.SCHWARZ);
        Assert.assertEquals("Getter / Setter fuer Farbe tut nicht, was er soll.", Karte.FARBE.SCHWARZ, k1.getFarbe());
        k1.setWert(9);
        Assert.assertEquals("Getter / Setter fuer Wert tut nicht, was er soll.", 9, k1.getWert());

        Karte k2 = new Karte(Karte.FARBE.SCHWARZ, 10);
        Assert.assertEquals("Konstruktor Karte(farbe, wert) funktioniert nicht, wie er soll.", Karte.FARBE.SCHWARZ, k2.getFarbe());
        Assert.assertEquals("Konstruktor Karte(farbe, wert) funktioniert nicht, wie er soll.", 10, k2.getWert());
    }
}