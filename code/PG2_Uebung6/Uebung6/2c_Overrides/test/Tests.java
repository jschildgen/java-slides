import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Witz witz = new FrageAntwortWitz("a", "b");
    Assert.assertEquals("a b", witz.getWitz());
  }
}