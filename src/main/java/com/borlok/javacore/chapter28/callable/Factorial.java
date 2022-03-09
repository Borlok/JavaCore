package main.java.com.borlok.javacore.chapter28.callable;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    private int stop;

    public Factorial(int num) {
        stop = num;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}
