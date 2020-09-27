package main.java.com.borlok.javacore.chapter15.lambda;

import main.java.com.borlok.javacore.chapter15.exceptions.EmptyArrayException;

/**
 * Пример генерирования исключения из лямбда-выражения
 */
public class LambdaExceptionDemo8 {
    public LambdaExceptionDemo8() throws EmptyArrayException {
        double [] values = {1.0, 2.0, 3.0, 4.0};
        DouЬleNumericArrayFunc average = x -> {
            double sum = 0;

            if (x.length == 0) throw new EmptyArrayException();

            for (int i = 0; i < x.length; i++) {
                sum += x[i];
            }
            return sum / x.length;
        };
        System.out.println("Среднее равно: " + average.func(values));
        // Этот код генерирует исключение
        System.out.println("Среднее равно: " + average.func(new double[0]));
    }
}
