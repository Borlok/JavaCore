package main.java.com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Применение Collector
 */
public class StreamDemo7 {
    public StreamDemo7() {
        List<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Petr","154-5565","Petr@mail.ru"));
        myList.add(new NamePhoneEmail("Alex","588-7894","Alex@mail.ru"));
        myList.add(new NamePhoneEmail("Vanya","243-8565","Vark@mail.ru"));

        System.out.println("Исходные эллементы:");

        myList.stream().forEach(x-> System.out.println(
                "Имя " + x.name
                + " телефон " + x.phoneNum
                + " адрес " + x.eMail));
        System.out.println();

        Stream<NamePhone> namePhone = myList.stream().map(x -> new NamePhone(x.name, x.phoneNum));
        List <NamePhone> namePhoneList = namePhone.collect(Collectors.toList());
        System.out.println(Arrays.toString(namePhoneList.toArray()));

        namePhone = myList.stream().map(x -> new NamePhone(x.name, x.phoneNum));
        Set<NamePhone> namePhoneSet = namePhone.collect(Collectors.toSet());
        System.out.println(namePhoneSet);
    }
}
