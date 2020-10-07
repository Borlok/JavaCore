package main.java.com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 *
 */
public class StreamDemo10 {
    public StreamDemo10() {
        List<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Beta");
        list.add("Gamma");
        list.add("Delta");
        list.add("Ksi");
        list.add("Omega");
        Stream<String> myStream = list.stream();

        Spliterator<String> spliterator1 = myStream.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        if (spliterator2 != null) {
            System.out.println("Spliterator2 result: ");
            spliterator2.forEachRemaining(System.out::println);
        }

        System.out.println("Spliterator result: ");
        spliterator1.forEachRemaining(System.out::println);


    }
}
