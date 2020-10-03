package main.java.com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Использование прямого отображения для чтения из файла
 */
public class MappedChaпnelRead2 {
    public MappedChaпnelRead2() {
        try (FileChannel fChanel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {
            long fSize = fChanel.size();
            MappedByteBuffer mBuf = fChanel.map(FileChannel.MapMode.READ_ONLY,0,fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
