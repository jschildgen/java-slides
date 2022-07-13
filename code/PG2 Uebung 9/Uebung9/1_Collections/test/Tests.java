import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tests {
  @Test
  public void testSolution() {
    Person p = new Person();
    p.setName("AAA");
    p.setWohnorte(List.of("BBB", "CCC"));
    p.setHobbies(Set.of("DDD", "EEE"));
    p.setTelefon(Map.of("FFF", "000", "GGG", "001"));
    Assert.assertEquals("Ein Problem mit getName/setName.", "AAA", p.getName());
    Assert.assertTrue("Ein Problem mit den Wohnorten.", p.getWohnorte().containsAll(List.of("BBB", "CCC")));
    Assert.assertTrue("Ein Problem mit den Hobbies.", p.getHobbies().containsAll(Set.of("DDD", "EEE")));
    Assert.assertTrue("Ein Problem mit den Telefonnummern.", p.getTelefon().containsKey("FFF") && p.getTelefon().containsKey("GGG"));
    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}