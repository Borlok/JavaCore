package com.borlok.javacore.chapter20;

import java.io.*;

/**
 * Применение класса FileReader
 */
public class FileReaderDemo14 {
    public FileReaderDemo14() {
        File file = new File("test.txt");
        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);;
        }
    }
}
