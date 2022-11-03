package com.borlok.javacore.chapter20;

import java.io.Console;

/**
 * Применение класса Console
 */
public class ConsoleDemo20 {
    public ConsoleDemo20() {
        String str;
        Console con;

        con = System.console();
        if (con == null) return;
        str = con.readLine("Введите строку: ");
        con.printf("Введенная вами строка: %s\n", str);
    }
}
