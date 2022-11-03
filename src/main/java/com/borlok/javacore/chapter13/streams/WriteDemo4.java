package com.borlok.javacore.chapter13.streams;

/**
 * Применение метода System.out.write (Определенного в OutputStream)
 */
public class WriteDemo4 {
    public WriteDemo4() {
        int symbol = 'A';
        System.out.write(symbol);
        System.out.write('\n');
    }
}
