package main.java.com.borlok.javacore.chapter10;

/**
 * Пример применения оператора throw
 */
public class ThrowDemoException7 {
    public static void demoProc() {
        try{
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoProc.");
            throw e;
        }
    }
}
