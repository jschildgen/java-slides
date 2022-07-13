import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Tests {
  @Test
  public void testSolution() {
    Uebersetzer ue = new Uebersetzer();
    Assert.assertEquals("Die uebersetzen-Methode soll den ursprünglichen String wiedergeben, wenn er nicht im Woerterbuch gefunden wird.", "abc123", ue.uebersetzen("abc123"));

    Path datei = null;
    try {
      datei = Files.createTempFile("abc123",".txt");
    } catch (IOException e) {
      Assert.fail("Fehler beim Anlegen einer temporaeren Datei.");
    }

    try(BufferedWriter br = Files.newBufferedWriter(datei, StandardOpenOption.CREATE)) {
      br.write("car|Auto");
      br.write("\nbike|Fahrrad");
    } catch (IOException e) {
      Assert.fail("Fehler beim Schreiben einer temporaeren Datei.");
    }

    try {
      ue = new Uebersetzer(datei);
      Assert.assertEquals("Eintraege im Woerterbuch werden nicht korrekt uebersetzt.", "Auto", ue.uebersetzen("car"));
      Assert.assertEquals("Eintraege im Woerterbuch werden nicht korrekt uebersetzt.", "Fahrrad", ue.uebersetzen("bike"));
    } catch (IOException e) {
      Assert.fail("Konstruktor Uebersetzer(Path) liefert eine IOException, obwohl eigentlich alles ok sein sollte.");
    }

    try(BufferedWriter br = Files.newBufferedWriter(datei, StandardOpenOption.APPEND)) {
      br.write("\nfoo|bar|baz");
    } catch (IOException e) {
      Assert.fail("Fehler beim Schreiben einer Datei im Temp-Verzeichnis.");
    }

    try {
      ue = new Uebersetzer(datei);
      Assert.fail("Konstruktor Uebersetzer(Path) soll eine IOException werfen, wenn die Woerterbuch-Datei ungueltige Zeilen enthaelt.");
    } catch (IOException e) {
    }

    try {
      Files.delete(datei);
    } catch (IOException e) {
    }

    try {
      Submit.submit();
    } catch (IOException e) {
      Assert.fail("Correct but submission failed: " + e.getMessage());
    }
  }
}