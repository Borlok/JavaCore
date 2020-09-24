package main.java.com.borlok.javacore.chapter13.streams;

import java.io.PrintWriter;

/**
 * Применение класса PrintWriter
 */
public class PrintWriterDemo5 {
    public PrintWriterDemo5() {
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("Это строка");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
