import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class Tests {
  @Test
  public void testSolution() {
    Konto konto = new Konto(555555);
    Assert.assertNotEquals("Der Kontostand ist null!", null, konto.getKontostand());
    Assert.assertEquals(0, BigDecimal.ZERO.compareTo(konto.getKontostand()));
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}