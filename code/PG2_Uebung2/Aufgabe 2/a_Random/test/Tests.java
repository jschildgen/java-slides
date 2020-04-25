import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

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
    boolean dice_6 = false;
    boolean dice_0 = false;
    for(int i = 1; i<= 100; i++) {
      Wuerfeln.main(new String[0]);
    }

    List<String> output = Arrays.asList(outContent.toString().split("\n"));
    Assert.assertFalse("Es wurde mal eine 0 gewuerfelt.", output.contains("Ich habe eine 0 gewuerfelt."));
    Assert.assertTrue("Es wurde nie eine 3 gewuerfelt.", output.contains("Ich habe eine 3 gewuerfelt."));
    Assert.assertTrue("Es wurde nie eine 6 gewuerfelt.", output.contains("Ich habe eine 6 gewuerfelt."));
  }
}