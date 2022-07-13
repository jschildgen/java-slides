import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
  @Test
  public void testSolution() {
    ComputerGegner c = new ComputerGegner();
    Assert.assertEquals(2,c.getStaerke());
    c.setStaerke(3);
    Assert.assertEquals(3,c.getStaerke());
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}