package main.java.com.borlok.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Демонстрация FileOutputStream
 */
public class FileOutputStreamDemo5 {
    public FileOutputStreamDemo5() {
        String text = "Now is the time for all good men to come to the aid of their country\n" +
                "and pay their due taxes";
        byte[] buf = text.getBytes();

        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");

            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }
            f1.write(buf);

            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("Такого файла не существует " + e);
        } finally {
            if (f0 != null)
                try {
                    f0.close();
                } catch (IOException e) {
                    System.out.println("Что то пошло не так при закрытии");
                }
            if (f1 != null)
                try {
                    f1.close();
                } catch (IOException e) {
                    System.out.println("Что то пошло не так при закрытии");
                }
            if (f1 != null)
                try {
                    f1.close();
                } catch (IOException e) {
                    System.out.println("Что то пошло не так при закрытии");
                }
        }
    }
}
