import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
    FizzBuzz.main(new String[0]);
    Assert.assertEquals("", fizzbuzz(100), outContent.toString().replaceAll("(\\r)", ""));
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }

  private String fizzbuzz(int n) {
    String res = "";
    for(int i = 1; i <= n; i++) {
      if(i % 15 == 0) {
        res += "FizzBuzz";
      } else if(i % 3 == 0) {
        res += "Fizz";
      } else if(i % 5 == 0) {
        res += "Buzz";
      } else {
        res += i;
      }
      if(i < 100) {
        res += ", ";
      }
    }
    int[] a;

    return res;
  }
}