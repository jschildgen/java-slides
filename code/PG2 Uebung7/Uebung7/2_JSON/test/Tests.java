import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
  @Test
  public void testSolution() {
    boolean passed = false;
    try {
      APIHelper.parseJson("{\"x : 5}");
    } catch (IllegalArgumentException e) {
      passed = true;
    }
    Assert.assertTrue("Beim nicht-wohlgeformten JSON-Objekt erscheint keine IllegalArgumentsException.", passed);

    passed = false;
    try {
      APIHelper.parseJson("[5,4,3,2,1]");
    } catch (IllegalArgumentException e) {
      passed = true;
    }
    Assert.assertTrue("Wenn kein JSON-Objekt uebergeben wird, erscheint keine IllegalArgumentsException.", passed);
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}