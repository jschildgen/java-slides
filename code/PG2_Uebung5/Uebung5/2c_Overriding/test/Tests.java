import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    ComputerGegner c = new ComputerGegner();
    Assert.assertEquals("Computer (Staerke 2)", c.getName());
    c.setStaerke(3);
    Assert.assertEquals("Computer (Staerke 3)", c.getName());
  }
}