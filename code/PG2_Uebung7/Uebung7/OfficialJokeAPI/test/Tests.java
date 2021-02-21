import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
  @Test
  public void testSolution() {
    WitzAPI api = new OfficialJokeAPI();
    Witz witz;
    try {
      witz = api.getZufallswitz();
      Assert.assertTrue("Es wird kein Witz zurueckgeliefert.", witz.getWitz().length() >= 5);
      Assert.assertTrue("Es wird kein FrageAntwortWitz-Objekt zurueckgeliefert.", witz instanceof FrageAntwortWitz);
    } catch (IOException e) {
      Assert.fail("getZufallswitz() liefert eine Exception.");
    }
  }
}