package main.java.com.borlok.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Применение класса CharArrayWriter
 */
public class CharArrayWriter17 {
    public CharArrayWriter17() {
        CharArrayWriter writer = new CharArrayWriter();
        String text = "Эти данные должны быть введены в массив";
        char [] buf = new char[text.length()];
        text.getChars(0,text.length(),buf,0);

        try {
            writer.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер: " + e);
            return;
        }
        System.out.println("Буфер в виде символьной строки");
        System.out.println(writer.toString());
        System.out.println("В массив ");
        char [] c = writer.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println("\nВ поток вывода типа FileWriter");
        try(FileWriter f = new FileWriter("test1.txt")) {
            writer.writeTo(f);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        System.out.println("Установка в исходное состояние");
        writer.reset();

        for (int i = 0; i < 3; i++) {
            writer.write('X');
        }
        System.out.println(writer.toString());
    }
}
