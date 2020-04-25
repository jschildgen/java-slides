import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Karte k1 = new Karte();
    if(k1.getFarbe() != Karte.FARBE.ROT && k1.getFarbe() != Karte.FARBE.SCHWARZ) {
      Assert.fail("Keine zufaellige Farbe erzeugt.");
    }

    if(k1.getWert() < 7 || k1.getWert() > 10) {
      Assert.fail("Ungueltiger Kartenwert.");
    }
  }
}