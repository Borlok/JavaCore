package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Применение простого лямбда выражения
 */
public class LambdaDemo14 {
    public LambdaDemo14() {
        MyNumber myNumber;

        myNumber = () -> 123.45;

        System.out.println("Фиксированное значение: " + myNumber.getValue());

        myNumber = () -> Math.random() * 100;

        System.out.println("Случайное значение: " + myNumber.getValue());
        System.out.println("Случайное значение 2: " + myNumber.getValue());
    }
}
