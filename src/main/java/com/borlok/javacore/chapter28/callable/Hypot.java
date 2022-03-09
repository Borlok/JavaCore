package main.java.com.borlok.javacore.chapter28.callable;

import java.util.concurrent.Callable;

public class Hypot implements Callable<Double> {
    private double side1, side2;

    public Hypot(int i, int i1) {
        side1 = i;
        side2 = i1;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}
