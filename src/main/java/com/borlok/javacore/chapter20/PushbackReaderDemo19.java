package com.borlok.javacore.chapter20;

import java.io.*;

/**
 * Применение класса PushbackReader
 */
public class PushbackReaderDemo19 {
    public PushbackReaderDemo19() {
        String s = "if (а == 4) а = O;\n";
        char [] buf = new char[s.length()];
        s.getChars(0,s.length(),buf,0);
        CharArrayReader in = new CharArrayReader(buf);
        int c;

        try (PushbackReader f = new PushbackReader(in)){
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = f.read()) == '='){
                            System.out.print(".eq.");
                        } else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
