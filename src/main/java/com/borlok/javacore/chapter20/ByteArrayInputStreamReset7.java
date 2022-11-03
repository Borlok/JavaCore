package com.borlok.javacore.chapter20;

import java.io.ByteArrayInputStream;

/**
 * Применение метода reset()
 */
public class ByteArrayInputStreamReset7 {
    public ByteArrayInputStreamReset7() {
        String tmp = "abc";

        byte [] b = tmp.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(b);

        for (int i = 0; i < 2; i++) {
            int c;
            while ((c = in.read()) != -1) {
                if (i == 0) {
                    System.out.print((char) c);
                } else {
                    System.out.print(Character.toUpperCase((char) c));
                }
            }
            System.out.println();
            in.reset();
        }
    }
}
