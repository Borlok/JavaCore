package main.java.com.borlok.javacore.chapter13.streams;
/**
 * Отображение содержимого файла с помощью FileInputStream
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFiles6 {
    public ShowFiles6(String fileName) {
        FileInputStream fin = null;
        int symbol = 0;
        if (fileName.isEmpty()){
            System.out.println("Не указано имя файла");
            return;
        }

        try {
            fin = new FileInputStream(fileName);

            while (symbol != -1) {
                symbol = fin.read();
                System.out.print((char) symbol);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла " + e);
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
