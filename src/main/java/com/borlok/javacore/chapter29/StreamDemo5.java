package com.borlok.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo5 {
    public StreamDemo5() {
        List<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Petr","154-5565","Petr@mail.ru"));
        myList.add(new NamePhoneEmail("Alex","588-7894","Alex@mail.ru"));
        myList.add(new NamePhoneEmail("Vanya","243-8565","Vark@mail.ru"));

        System.out.println("Исходные эллементы:");

        myList.stream().forEach(x-> System.out.println("Имя " + x.name + " телефон " + x.phoneNum
                + " адрес " + x.eMail));
        System.out.println();

        Stream<NamePhone> namePhone = myList.stream().map(x -> new NamePhone(x.name, x.phoneNum));

        namePhone.forEach(x -> System.out.println(x));

    }
}
