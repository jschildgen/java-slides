import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
  @Test
  public void testSolution() {
    for(java.lang.reflect.Method m : WitzAPI.class.getMethods()) {
      Assert.assertTrue(m.getName().equals("getZufallswitz") && m.getParameterCount() == 0 && m.getReturnType().getName() == "Witz"
              || m.getName().equals("getWitze") && m.getParameterCount() == 1 && m.getReturnType().getName() == "[LWitz;"
              || m.getName().equals("getKategorien") && m.getParameterCount() == 0 && m.getReturnType().getName() == "[LKategorie;");
    }
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}