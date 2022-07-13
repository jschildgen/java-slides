import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(getToken(), Task.getToken());
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }

  private static String getToken() {
    Path file = Paths.get(System.getProperty("user.home"), "submitpg2.txt");
    if (!Files.exists(file)) {
      return null;
    }
    BufferedReader br = null;
    try {
      br = Files.newBufferedReader(file);
      String token = br.readLine();
      return token;
    } catch (IOException e) {
      return null;
    }
  }
}