package com.borlok.javacore.chapter13;

/**
 * Пример применения платформенно-ориентированного метода
 * делает небезопасным и непереносимым на другие платформы.
 */
public class NativeDemo10 {
    int i;

    public static void main(String[] args) {
        NativeDemo10 ob = new NativeDemo10();
        ob.i = 10;
        System.out.println("Переменнная ob.i до вызова платформенно-ориентированного " +
                "метода test(): " + ob.i);
        ob.test();
        System.out.println("Переменнная ob.i после вызова платформенно-ориентированного " +
                "метода test(): " + ob.i);
    }
    public native void test(); // Объявление платформенно ориентированного метода

    static {
        System.loadLibrary("NativeDemo");
    }
}
