package main.java.com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Демонстрация стримовых операций
 */
public class StreamDemo1 {
    public StreamDemo1() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Исходный список: " + myList);
        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent())
            System.out.println("Минимальное значение: " + minVal.get());

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compareTo);
        if (maxVal.isPresent())
            System.out.println("максимальное значение: " + maxVal.get());

        Stream<Integer> sortedStream = myList.stream().sorted();

        System.out.println("Отсортированный поток данных: ");
        sortedStream.forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("Нечетные: ");
        Stream<Integer> oddVals = myList.stream().sorted().filter(x -> (x % 2) == 1);
        oddVals.forEach(x -> System.out.print(x + " "));
        System.out.println();
        oddVals = myList.stream().filter(x -> (x % 2) == 1).filter(x -> x > 5);
        System.out.println("Нечетные значения больше 5: ");
        oddVals.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
