package com.borlok.javacore.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Применение буферизированного ввода
 */
public class BufferedInputStreamDemo9 {
    public BufferedInputStreamDemo9() {
        String s = "This is a sign of authors &copy; , but &copy - not.\n";
        byte [] buf = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;
        try (BufferedInputStream f = new BufferedInputStream(in)) {
            while ((c =  f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                        f.mark(32);
                        marked = true;
                    } else
                        marked = false;
                        break;
                    case ';':
                        if (marked) {
                        marked = false;
                        System.out.print("(c)");
                    } else
                            System.out.print((char) c);
                        break;
                    case ' ': if (marked){
                        marked = false;
                        f.reset();
                        System.out.print("&");
                    } else
                        System.out.print((char) c);
                        break;
                    default:
                        if (!marked)
                            System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
