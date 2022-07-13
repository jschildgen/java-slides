import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(Paths.get(System.getProperty("java.io.tmpdir")),
            Task.getTmpdir());
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}