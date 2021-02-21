import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class Tests {
  @Test
  public void testSolution() {
    Konto konto = new Konto();
    Assert.assertNotEquals("Der Kontostand ist null!", null, konto.getKontostand());
    Assert.assertEquals(0, BigDecimal.ZERO.compareTo(konto.getKontostand()));
  }
}