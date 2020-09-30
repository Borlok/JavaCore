package main.java.com.borlok.javacore.chapter20;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Применение класса FileWriter
 */
public class FileWriterDemo15 {
    public FileWriterDemo15() {
        String text = "Now is the time for all good men to come to the aid of their country\n" +
                "and pay their due taxes";
        char [] buf = new char[text.length()];
        text.getChars(0,text.length(),buf,0);

        try (
                FileWriter f0 = new FileWriter("file1.txt");
                FileWriter f1 = new FileWriter("file2.txt");
                FileWriter f2 =  new FileWriter("file3.txt")){

            for (int i = 0; i < text.length(); i+=2) {
                f0.write(buf[i]);
            }
            f1.write(buf);
            f2.write(buf, buf.length - buf.length/4, buf.length/4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
