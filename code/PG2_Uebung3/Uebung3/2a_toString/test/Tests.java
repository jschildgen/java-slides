import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Karte k1 = new Karte(Karte.FARBE.ROT, 9);
    Assert.assertEquals("Rote Karten werden falsch ausgegeben.","Rote 9", k1.toString());

    Karte k2 = new Karte(Karte.FARBE.SCHWARZ, 8);
    Assert.assertEquals("Schwarze Karten werden falsch ausgegeben.","Schwarze 8", k2.toString());
  }
}