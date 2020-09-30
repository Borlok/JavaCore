package main.java.com.borlok.javacore.chapter20;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Применение CharArrayReader
 */
public class CharArrayReaderDemo16 {
    public CharArrayReaderDemo16() {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        int length = tmp.length();
        char [] buf = new char[length];
        tmp.getChars(0,length,buf,0);
        System.out.println(Arrays.toString(buf));
        int i;
        try(CharArrayReader reader = new CharArrayReader(buf)) {
            System.out.println("input1:");
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(CharArrayReader reader2 = new CharArrayReader(buf,0,5)) {
            System.out.println("input2:");
            while ((i = reader2.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
