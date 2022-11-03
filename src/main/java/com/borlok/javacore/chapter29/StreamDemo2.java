package com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Применение операции reduce()
 */
public class StreamDemo2 {
    public StreamDemo2() {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(18);
        list.add(10);
        list.add(24);
        list.add(17);
        list.add(5);

        Optional<Integer> prodObj = list.stream().reduce((a,b) -> {
            System.out.println(a + " " + b + " = " + (a * b));
            return a * b;});
        System.out.println("Произведение в виде значения типа Optional: " + prodObj.get());

        int prod =  list.stream().reduce(1, (a,b) -> {
            System.out.println(a + " " + b + " =" + (a * b));
            return a * b;});
        System.out.println("Произведение в виде значения типа int: " + prod);
    }
}
