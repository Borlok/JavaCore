package main.java.com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Применение итератора
 */
public class StreamDemo8 {
    public StreamDemo8() {
        List<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Beta");
        list.add("Gamma");
        list.add("Delta");
        list.add("Ksi");
        list.add("Omega");
        Stream<String> myStream = list.stream();

        Iterator<String> itr = myStream.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
