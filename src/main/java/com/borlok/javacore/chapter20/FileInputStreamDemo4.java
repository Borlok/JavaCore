package com.borlok.javacore.chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Демонстрация FileInputStream
 */
public class FileInputStreamDemo4 {
    public FileInputStreamDemo4() {
        int size = 0;
        try (FileInputStream fis = new FileInputStream("./src/main/java/com/borlok/javacore/chapter20/FileInputStreamDemo4.java")) {
            System.out.println("Общее количество доступных байтов " + (size = fis.available()));
            int n = size / 40;
            System.out.println("Первые " + n + " байтов, прочитанных из очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) fis.read());
            }
            System.out.println("Все еще доступно " + fis.available());
            System.out.println("Чтение следующих " + n + " байтов по очереди методом read(byte[])");
            byte [] b = new byte[n];
            if (fis.read(b) != n){
                System.err.println("Невозможно прочитать " + n + " байтов");
            }

            System.out.println(new String(b,0,n));
            System.out.println("Все еще доступно: " + (size = fis.available()));
            System.out.println("Пропустить половину оставшихся байтов методом skip()");
            fis.skip(size/2);
            System.out.println("Все еще доступно " + fis.available());
            System.out.println("Чтение " + size/2 + " байтов, размещаемых в конце массива");
            if (fis.read(b,n/2,n/2) != n/2) {
                System.err.println("Невозможно прочитать " + n + " байтов");
            }
            System.out.println(new String(b,0,b.length));
            System.out.println("Все еще доступно " + fis.available());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
