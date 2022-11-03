package com.borlok.javacore.chapter15.lambda;

/**
 * Применение лямбда-ссылки на конструктор
 */
public class ConstructorRefDemo14 {

    public ConstructorRefDemo14() {
        MyFunc3 myClass = MyClass13::new;
        MyClass13 mc = myClass.func(100);
        System.out.println("Значение val = " + mc.getVal());
    }
}
