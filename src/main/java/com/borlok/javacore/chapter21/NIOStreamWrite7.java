package main.java.com.borlok.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Потоковый вывод на основе NIO
 */
public class NIOStreamWrite7 {
    public NIOStreamWrite7() {
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))) {
            for (int i = 0; i < 26; i++) {
                fout.write((byte) ('A' + i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
