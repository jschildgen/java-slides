import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tests {
  @Test
  public void testSolution() {
    Task.main(new String[]{});
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "zahlen.txt");
    String s = "";
    try(BufferedReader br = Files.newBufferedReader(path)) {
      String line;
      while ((line = br.readLine()) != null) {
        s += line + "\n";
      }
    } catch (IOException e) {
      Assert.fail("IOException: "+e.getMessage());
    }
    Assert.assertEquals("1\n2\n3\n4\n5\n", s);
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}