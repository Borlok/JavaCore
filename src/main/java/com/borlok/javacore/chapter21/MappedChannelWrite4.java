package main.java.com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite4 {
    public MappedChannelWrite4() {
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.CREATE,
                StandardOpenOption.READ,
                StandardOpenOption.WRITE))
        {
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE,0,26);
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
