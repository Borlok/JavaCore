package main.java.com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Копирование файла в NIO
 */
public class NIOCopy5 {
    public NIOCopy5() {
        Path source = Paths.get("test.txt");
        Path target = Paths.get("test1.txt");

        try {
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Ошибка копирования: " + e);
        }
    }
}
