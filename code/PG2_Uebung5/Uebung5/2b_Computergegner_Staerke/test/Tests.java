import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    ComputerGegner c = new ComputerGegner();
    Assert.assertEquals(2,c.getStaerke());
    c.setStaerke(3);
    Assert.assertEquals(3,c.getStaerke());
  }
}