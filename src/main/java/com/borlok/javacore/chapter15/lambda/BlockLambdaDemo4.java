package com.borlok.javacore.chapter15.lambda;

/**
 * Применение блочного лямбда выражения
 */
public class BlockLambdaDemo4 {
    public BlockLambdaDemo4() {
        int value = 5;

        NumericFunc factorial = x -> {
          int result = 1;
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Факториал числа " + value + " = " + factorial.func(value));
    }
}
