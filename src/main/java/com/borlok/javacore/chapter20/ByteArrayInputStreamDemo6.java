package main.java.com.borlok.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Создание ByteArrayInputStream
 */
public class ByteArrayInputStreamDemo6 {
    public ByteArrayInputStreamDemo6() {
        String tmp = "Hello, my friend!";

        byte [] a = tmp.getBytes();
        System.out.println(Arrays.toString(a));
        ByteArrayInputStream in = new ByteArrayInputStream(a);
        ByteArrayInputStream in2 = new ByteArrayInputStream(a,0,3);
    }
}
