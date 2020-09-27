package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Пример передачи лямбды в аргументе
 */
public class LambdasAsArgumentsDemo7 {
    public LambdasAsArgumentsDemo7(StringFunc func, String text) {
        System.out.println(func.func(text));

    }
}
