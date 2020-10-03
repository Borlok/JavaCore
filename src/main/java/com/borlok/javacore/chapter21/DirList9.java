package main.java.com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Пример перехода по каталогу
 */
public class DirList9 {
    public DirList9() {
        String dirName = "./";

        try (DirectoryStream<Path> dirStrm = Files.newDirectoryStream(Paths.get(dirName),"*{.txt}")) {
            System.out.println("Каталог " + dirName);
            for (Path entry : dirStrm) {
                BasicFileAttributes attributes = Files.readAttributes(entry,BasicFileAttributes.class);
                if (attributes.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("      ");
                System.out.println(entry.getName(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
