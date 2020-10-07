package main.java.com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 * Применение сплитератора
 */
public class StreamDemo9 {
    public StreamDemo9() {
        List<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Beta");
        list.add("Gamma");
        list.add("Delta");
        list.add("Ksi");
        list.add("Omega");
        Stream<String> myStream = list.stream();

        Spliterator<String> itr = myStream.spliterator();

        while (itr.tryAdvance(System.out::println));

        itr.forEachRemaining(System.out::println);
    }
}
