import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class Tests {
  @Test
  public void testSolution() {
    Konto konto = new Konto(555555);
    konto.auszahlen(new BigDecimal("1.11"));
    konto.auszahlen(new BigDecimal("2.22"));
    Assert.assertEquals(new BigDecimal("-3.33"),konto.getKontostand());
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}