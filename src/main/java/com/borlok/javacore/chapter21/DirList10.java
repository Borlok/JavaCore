package main.java.com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Пример фильтра файлов
 */
public class DirList10 {
    public DirList10() {
        String dirName = "./";
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                if (Files.isWritable(entry)) return true;
                return false;
            }
        };
        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(dirName), how)) {
            System.out.println("Каталог " + dirName);
            for (Path entry : dirStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
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