import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Spieler s = new ComputerGegner();
    Assert.assertEquals("Computer", s.getName());
  }
}