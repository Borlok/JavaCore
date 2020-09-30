package main.java.com.borlok.javacore.chapter20;

import java.io.*;

/**
 * Применение класса ByteArrayOutputStream
 */
public class ByteArrayOutputStreamDemo8 {
    public ByteArrayOutputStreamDemo8() {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть введены в массив";

        byte [] buf = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            e.printStackTrace();
        }
        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");
        byte [] b = f.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }
        System.out.println("\nВ поток вывода типа OutputStream");
        try(FileOutputStream out = new FileOutputStream("test.txt")) {
            f.writeTo(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
            e.printStackTrace();
        }
        System.out.println("Установка в исходное состояние");
        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
