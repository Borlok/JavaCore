package com.borlok.javacore.chapter13.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Применение класса BufferedReader для чтения из консоли (строковое чтение)
 */
public class BrReadLines2 {
    public BrReadLines2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "";
        System.out.println("Введите текст");
        System.out.println("для выхода наберите 'стоп'");
        while (!text.equals("стоп")) {
            text = reader.readLine();
            System.out.println(text);
        }
    }
}
