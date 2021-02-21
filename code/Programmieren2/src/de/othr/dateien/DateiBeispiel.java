package de.othr.dateien;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;


public class DateiBeispiel {
    public static void main(String[] args) {
        String os_name     = System.getProperty("os.name");
        String project_dir = System.getProperty("user.dir");
        String home_dir    = System.getProperty("user.home");
        String tmp_dir     = System.getProperty("java.io.tmpdir");
        String file_sep    = System.getProperty("file.separator");
        System.out.printf("%s\n%s\n%s\n%s\n%s\n", os_name, project_dir, home_dir, tmp_dir, file_sep);

        Path tmp = Paths.get(tmp_dir);
        Path datei = Paths.get(tmp_dir
              + System.getProperty("file.separator")
              + "datei.txt");
        datei = Paths.get(tmp_dir, "datei.txt");
        datei = tmp.resolve("datei.txt");

        files_beispiel();
        ordnerInhalt();
        schreiben_und_lesen();
    }



    public static void files_beispiel() {
        Path tmp = Paths.get(
         System.getProperty("java.io.tmpdir"));
        Path datei = tmp.resolve("datei.txt");

        if(!Files.exists(datei)) {
            try {
                Files.createFile(datei);
            } catch (IOException e) {
                System.out.printf(
                 "Kann %s nicht anlegen",
                 datei.toString());
                return;
            }
        }
        try {
            System.out.printf("%s ist %d Bytes groß",
                              datei, Files.size(datei));
        } catch(IOException e) {
            System.out.printf("Kann auf %s nicht zugreifen", datei);
            return;
        }
    }


    public static void ordnerInhalt() {
        Path ordner = Paths.get(System.getProperty("user.dir"));
        try(DirectoryStream<Path> dateien = Files.newDirectoryStream(ordner)) {
            for(Path datei : dateien) {
                System.out.println(datei);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void schreiben_und_lesen() {
        String tmp_dir = System.getProperty("java.io.tmpdir");
        Path datei = Paths.get(tmp_dir, "datei.txt");
        try(BufferedWriter bw = Files.newBufferedWriter(datei,
                                    StandardOpenOption.APPEND,
                                    StandardOpenOption.CREATE)) {
            bw.write("Hallo!\n");
            bw.write("Tolle Datei!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
