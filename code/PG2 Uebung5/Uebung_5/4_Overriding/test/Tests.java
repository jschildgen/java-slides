import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
  @Test
  public void testSolution() {
    ComputerGegner c = new ComputerGegner();
    Assert.assertEquals("Computer (Staerke 2)", c.getName());
    c.setStaerke(3);
    Assert.assertEquals("Computer (Staerke 3)", c.getName());
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}