import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class Tests {
  @Test
  public void testSolution() {
    Konto k1 = new Konto();
    Konto k2 = new Konto();
    Bank.ueberweisen(k1, k2, BigDecimal.ONE);
    Assert.assertEquals(BigDecimal.ZERO.subtract(BigDecimal.ONE), k1.getKontostand());
    Assert.assertEquals(BigDecimal.ONE, k2.getKontostand());
  }
}