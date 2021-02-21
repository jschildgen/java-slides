import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Person p = new Person();
    Assert.assertEquals("Der Name ist falsch", "Katja", p.getName());
    Assert.assertEquals("Die Hobbies sind falsch", 2, p.getHobbies().size());
    Assert.assertTrue("Die Hobbies sind falsch", p.getHobbies().contains("Tennis"));
    Assert.assertTrue("Die Hobbies sind falsch", p.getHobbies().contains("Klavier"));
    Assert.assertEquals("Die Wohnorte sind falsch", 2, p.getWohnorte().size());
    Assert.assertEquals("Die Wohnorte sind falsch", "Regensburg", p.getWohnorte().get(0));
    Assert.assertEquals("Die Wohnorte sind falsch", "Berlin", p.getWohnorte().get(1));
    Assert.assertEquals("Die Telefonnummern sind falsch", 2, p.getTelefon().size());
    Assert.assertEquals("Die Telefonnummern sind falsch", "0151/55", p.getTelefon().get("Mobil"));
    Assert.assertEquals("Die Telefonnummern sind falsch", "0941/55", p.getTelefon().get("Privat"));

  }
}