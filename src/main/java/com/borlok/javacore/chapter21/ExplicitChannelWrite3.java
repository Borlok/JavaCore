package main.java.com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Запись данных в файл по средством NIO
 */
public class ExplicitChannelWrite3 {
    public ExplicitChannelWrite3() {
        try(FileChannel channel = (FileChannel)Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE)) {
            ByteBuffer buf = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                buf.put((byte) ('A' + i));
            }
            buf.rewind();
            channel.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
