package com.borlok.javacore.chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Потоковый ввод на основе NIO
 */
public class ShowFile6 {
    public ShowFile6() {
        int sym = 0;
        try (InputStream fis = Files.newInputStream(Paths.get("test.txt"))) {

            while (sym != -1) {
                sym = fis.read();
                System.out.print((char) sym);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
