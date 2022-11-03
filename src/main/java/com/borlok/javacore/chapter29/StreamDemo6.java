package com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Применение mapToInt
 */
public class StreamDemo6 {
    public StreamDemo6() {
        List<Double> list = new ArrayList<>();
        list.add(7.3);
        list.add(18.2);
        list.add(10.6);
        list.add(24.1);
        list.add(17.3);
        list.add(5.0);

        System.out.println("Исходные значения: ");
        list.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println("Показать максимально доступное число:");
        IntStream intStream = list.stream().mapToInt(x -> (int) Math.ceil(x));
        intStream.forEach(x -> System.out.print(x + " "));


    }
}
