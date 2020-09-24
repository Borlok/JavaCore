package main.java.com.borlok.javacore.chapter13.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Применение класса BufferedReader для чтения из консоли (символьное чтение)
 */
public class BrReader1 {
    public BrReader1() throws IOException {
        char c = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода.");
        do {
            c = (char) reader.read();
            System.out.println(c);
        } while (c != 'q');
    }


}
