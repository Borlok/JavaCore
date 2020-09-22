package main.java.com.borlok.javacore.chapter10;

/**
 * Пример применения оператора throws
 */
public class ThrowsDemoException8 {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри метода throwOne");
        throw new IllegalAccessException("Демонстрация");
    }
}
