package com.borlok.javacore.chapter20;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * Применение очереди последовательного ввода
 */
public class SequenceInputStreamDemo11 {
    public SequenceInputStreamDemo11() {
        int c;
        Vector<String> files = new Vector<>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumerator11 ise = new InputStreamEnumerator11(files);


        try (InputStream input = new SequenceInputStream(ise)){
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
