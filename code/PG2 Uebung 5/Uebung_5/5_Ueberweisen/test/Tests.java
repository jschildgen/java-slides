import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class Tests {
  @Test
  public void testSolution() {
    Konto k1 = new Konto(567890);
    Konto k2 = new Konto(654321);
    k1.einzahlen(BigDecimal.TEN);
    k2.einzahlen(BigDecimal.TEN);
    Bank.ueberweisen(k1, k2, BigDecimal.ONE);
    Assert.assertEquals(BigDecimal.TEN.subtract(BigDecimal.ONE), k1.getKontostand());
    Assert.assertEquals(BigDecimal.TEN.add(BigDecimal.ONE), k2.getKontostand());
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}