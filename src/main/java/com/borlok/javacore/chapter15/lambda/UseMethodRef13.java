package main.java.com.borlok.javacore.chapter15.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Пример использования лямбды как компаратора
 */
public class UseMethodRef13 {
    static int compareMC (MyClass13 a, MyClass13 b) {
        return a.getVal() - b.getVal();
    }

    public UseMethodRef13() {
        List<MyClass13> list = new ArrayList<>();
        list.add(new MyClass13(1));
        list.add(new MyClass13(4));
        list.add(new MyClass13(3));
        list.add(new MyClass13(9));
        list.add(new MyClass13(2));
        list.add(new MyClass13(7));


        MyClass13 myClass13 = Collections.max(list, UseMethodRef13::compareMC);
        System.out.println(myClass13.getVal());
    }
}
