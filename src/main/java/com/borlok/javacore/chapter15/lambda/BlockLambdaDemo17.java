package com.borlok.javacore.chapter15.lambda;

import java.util.function.Function;

public class BlockLambdaDemo17 {
    public BlockLambdaDemo17() {
        Function<Integer,Integer> factorial = x -> {
          int result = 1;

            for (int i = 1; i < x; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Факториал числа 5 = " + factorial.apply(5));
    }
}
