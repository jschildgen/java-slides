import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    WitzAPI api = new MeineTestAPI();
    Assert.assertNotNull(api.getZufallswitz());
    Assert.assertNotNull(api.getKategorien());
    Kategorie k = null;
    if(api.getKategorien().length > 0) {
      k = api.getKategorien()[0];
    }
    Assert.assertNotNull(api.getWitze(k));
  }
}