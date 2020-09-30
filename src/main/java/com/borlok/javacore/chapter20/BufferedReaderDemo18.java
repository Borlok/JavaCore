package main.java.com.borlok.javacore.chapter20;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

/**
 * Применение класса BufferedReader
 */
public class BufferedReaderDemo18 {
    public BufferedReaderDemo18() {
        String s = "This is a sign of authors &copy; , but &copy - it's not.\n";
        char [] buf = new char[s.length()];
        s.getChars(0,s.length(),buf,0);
        CharArrayReader in = new CharArrayReader(buf);
        int c;
        boolean marked = false;
        try (BufferedReader reader = new BufferedReader(in)) {
            while ((c = reader.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            reader.mark(32);
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
                    case ' ':
                        if (marked) {
                            marked = false;
                            reader.reset();
                            System.out.print('&');
                        }else
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
