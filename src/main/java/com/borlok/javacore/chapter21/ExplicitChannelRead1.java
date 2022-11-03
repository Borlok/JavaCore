package com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *  Использование канала ввода-вывода для чтения файла
 */
public class ExplicitChannelRead1 {
    public ExplicitChannelRead1() {
        int count;
        Path filePath = null;
        try {
            filePath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Ошибка в пути к файлу: " + e);
            return;
        }

        try (SeekableByteChannel channel = Files.newByteChannel(filePath)) {
            ByteBuffer buffer = ByteBuffer.allocate(128);
            do {
                count = channel.read(buffer);
                if (count != -1) {
                    buffer.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
