import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
  @Test
  public void testSolution() {
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: "+e.getMessage());
    }
  }
}