package com.borlok.javacore.chapter15.lambda;

/**
 * Пример со ссылкой на статический метод с классом MyStringOps10,
 * и не статический метод с классом MyStringOps210
 */
public class MethodRefDemo10 {

    static String stringOp (StringFunc func, String text) {
        return func.func(text);
    }

    public MethodRefDemo10() {
        String text = "Лямбда-выражения повышают эффективность Java";
        MyStringOps210 ops = new MyStringOps210();

        String out = stringOp(MyStringOps10::strReverse,text);
        String out2 = stringOp(ops::strReverse,text); // Пример лямбды с экземпляром класса(Не статический метод)

        System.out.println("Было: " + text);
        System.out.println("Стало: " + out);
        System.out.println("Стало в примере с экземпляром: " + out2);

    }



}
