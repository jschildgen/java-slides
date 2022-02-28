import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

  @Test
  public void testSolution() {
    GeradeZahlen.main(new String[0]);
    Assert.assertEquals("", "2\n" +
            "4\n" +
            "6\n" +
            "8\n" +
            "10\n" +
            "12\n" +
            "14\n" +
            "16\n" +
            "18\n" +
            "20\n", outContent.toString());
  }
}