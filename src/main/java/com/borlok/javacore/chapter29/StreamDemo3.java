package main.java.com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;

/**
 * Применение операции reduce() с объединяющей формой
 */
public class StreamDemo3 {
    public StreamDemo3() {
        List<Double> list = new ArrayList<>();
        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);

        double sqrt = list.parallelStream().reduce(1.0,
                (x,z) -> {
                    System.out.println("Накопитель " + x + " " + z + " =" + (x * Math.sqrt(z)));
                    return x * Math.sqrt(z);
                },
                (x,z) -> {
                    System.out.println("Объединитель " + x + " " + z + " =" + (x * z));
                    return x * z;
                });

        System.out.println("Произведение квадратных корней: " + sqrt);
    }
}
