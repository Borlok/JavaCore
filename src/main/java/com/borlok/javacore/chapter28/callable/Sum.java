package main.java.com.borlok.javacore.chapter28.callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    private int stop;
    public Sum(int num) {
        stop = num;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}
