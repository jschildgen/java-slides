import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
  @Test
  public void testSolution() {
    Konto[] konto = new Konto[10];
    for(int i=0;i<konto.length;i++) {
      konto[i] = new Konto();
      if(i > 0) {
        Assert.assertEquals(1, konto[i].getKontonr()-konto[i-1].getKontonr());
      }
    }
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}