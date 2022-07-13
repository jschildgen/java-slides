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
    String input = "9\n2\n6\n8\n77\n21\n12\n";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    Zweiter.main(new String[0]);
    Assert.assertEquals("1. Zahl: 2. Zahl: 3. Zahl: 4. Zahl: 5. Zahl: 6. Zahl: 7. Zahl: Zweitkleinste: 6\nZweitgroesste: 21\n", outContent.toString().replaceAll("(\\r)", ""));
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}