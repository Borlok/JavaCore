package main.java.com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Применение операции map()
 */
public class StreamDemo4 {
    public StreamDemo4() {
        List<Double> list = new ArrayList<>();
        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);

        Stream<Double> sqrt = list.stream().map(x -> Math.sqrt(x));

        double value = sqrt.reduce(1.0,(x,z) -> x * z);

        System.out.println("Произведение квадратных корней: " + value);
    }
}
