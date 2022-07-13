import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
  @Test
  public void testSolution() {
    Spieler s = new ComputerGegner();
    Assert.assertEquals("Computer", s.getName());
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}