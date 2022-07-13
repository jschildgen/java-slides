import org.junit.*;

import java.io.*;

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
    Main.main(new String[0]);
    Assert.assertEquals("Na endlich!\n", outContent.toString().replaceAll("(\\r)", ""));
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}