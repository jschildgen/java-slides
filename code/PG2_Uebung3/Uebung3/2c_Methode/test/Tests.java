import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Karte k1 = new Karte(Karte.FARBE.SCHWARZ, 10);
    Karte k2 = new Karte(Karte.FARBE.SCHWARZ, 9);
    Karte k3 = new Karte(Karte.FARBE.ROT, 8);

    Assert.assertTrue("Schwarz auf schwarz sollte gehen!", k1.kannGelegtWerdenAuf(k2));
    Assert.assertFalse("Schwarz auf rot sollte nicht gehen!", k1.kannGelegtWerdenAuf(k3));
  }
}