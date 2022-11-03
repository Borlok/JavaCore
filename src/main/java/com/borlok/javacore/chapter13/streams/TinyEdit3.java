package com.borlok.javacore.chapter13.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Простейший текстовый редактор
 */
public class TinyEdit3 {
    public TinyEdit3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] strings = new String[100];
        System.out.println("Введите текст");
        System.out.println("для выхода наберите 'стоп'");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
            if (strings[i].equals("стоп"))
                break;
        }
        System.out.println("Содержимое вашего файла:");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("стоп"))
                break;
            System.out.println(strings[i]);
        }
    }
}
