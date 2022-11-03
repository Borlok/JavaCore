package com.borlok.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Применение класса URL
 */
public class URLDemo3 {
    public URLDemo3() {
        try {
            URL hp = new URL("http://www.HerbSchildt.com/Articles");
            System.out.println("Протокол: " + hp.getProtocol());
            System.out.println("Порт: " + hp.getPort());
            System.out.println("Хост: " + hp.getHost());
            System.out.println("Файл: " + hp.getFile());
            System.out.println("Полная форма: " + hp.toExternalForm());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
