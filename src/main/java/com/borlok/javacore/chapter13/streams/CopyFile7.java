package main.java.com.borlok.javacore.chapter13.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Использование FileOutputStream и FileInputStream (Копирование из - в файл)
 * используется try с ресурсами.
 */
public class CopyFile7 {
    public CopyFile7(String ref1, String ref2) {
        int symbol = 0;
        if (ref1.isEmpty() || ref2.isEmpty()) {
            System.out.println("Ссылка на файл не указана");
            return;
        }

        try (FileInputStream fin = new FileInputStream(ref1);
             FileOutputStream fout = new FileOutputStream(ref2)) {

            while (symbol != -1) {
                symbol = fin.read();
                fout.write(symbol);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
    }
}
