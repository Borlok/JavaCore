package com.borlok.javacore.chapter15.lambda;

/**
 * Применение лямбда выражения с параметром
 */
public class LambdaWithParameter2 {
    public LambdaWithParameter2() {
        NumericTest test;
        int i = -10;

        test = x -> (x % 2) ==0;

        if (test.test(i))
            System.out.println("Число " + i + " четное");
        if (!test.test(i))
            System.out.println("Число " + i + " нечетное");

        NumericTest isNonNeg = x -> x >= 0;

        if (isNonNeg.test(i))
            System.out.println("Число " + i + " положительное");
        if (!isNonNeg.test(i))
            System.out.println("Число " + i + " отрицательное");
    }
}
