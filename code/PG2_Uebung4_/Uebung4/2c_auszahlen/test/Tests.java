import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class Tests {
  @Test
  public void testSolution() {
    Konto konto = new Konto();
    konto.auszahlen(new BigDecimal("1.11"));
    konto.auszahlen(new BigDecimal("2.22"));
    Assert.assertEquals(new BigDecimal("-3.33"),konto.getKontostand());
  }
}