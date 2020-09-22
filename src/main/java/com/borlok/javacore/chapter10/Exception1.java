package main.java.com.borlok.javacore.chapter10;

/**
 * Использование операторов try/catch (простой пример)
 */
public class Exception1 {
    public Exception1() {
        try {
            int a,b;
            b = 0;
            a = 42 / 0; //При обнаружении деления на ноль, остальная часть кода в блоке try не выполняется
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
}
