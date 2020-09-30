package main.java.com.borlok.javacore.chapter15.lambda;

import main.java.com.borlok.javacore.chapter15.exceptions.EmptyArrayException;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) throws EmptyArrayException {
//        new LambdaDemo1(); // Применение простого лямбда выражения
//        new LambdaWithParameter2(); // Применение лямбда выражения с параметром
//        new LambdaWith2Parameters3(); // Пример лямбда-выражения с двумя параметрами
//        new BlockLambdaDemo4(); // Применение блочного лямбда выражения (Факториал)
//        new BlockLambdaDemoString5(); // Применение блочного лямбда выражения 2 (Реверс слова)
//        new GenericFunctionalInterfaceDemo6(); // Применение обобщенного функционального интерфейса
//        new LambdasAsArgumentsDemo7(x->x.toUpperCase(), "Hello world"); //Пример передачи лямбды в аргументе
        //Пример передачи лямбды в аргументе (Блочная версия)
//        new LambdasAsArgumentsDemo7(x->{
//            String result = "";
//
//            for (int i = 0; i < x.length(); i++) {
//                if (x.charAt(i) != ' ')
//                    result += x.charAt(i);
//            }
//            return result;
//        }, "Hello world");
        ///////////////////////// Конец примера

        //Пример передачи лямбды в аргументе (С передачей объекта лямбды)
//        StringFunc reverse = x -> {
//            StringBuilder result = new StringBuilder();
//            for (int i = x.length()-1; i >= 0 ; i--) {
//                result.append(x.charAt(i));
//            }
//            return result.toString();
//        };
//        new LambdasAsArgumentsDemo7(reverse, "Hello world");
        ///////////////////////// Конец примера
//        new LambdaExceptionDemo8(); // Пример генерирования исключения из лямбда-выражения
//        new VarCapture9(); // Пример использования локальных переменных в лямбда выражениях
//        new MethodRefDemo10(); // Пример со ссылкой на статический и не статический метод с классом MyStringOps
        new InstanceMethWithObjectRefDemo11(); // Пример лямбды, где параметрами выступают класс и параметр метода класса
        new GenericMethodRefDemo12(); // Применение лямбды на обобщенный метод
        new UseMethodRef13(); // Пример использования лямбды как компаратора
        new ConstructorRefDemo14(); // Применение лямбда-ссылки на конструктор
//        new ConstructorRefDemo215(); // Применение ссылки на конструктор на обобщенный класс
//        new ConstructorRefDemo316(); // Реализация простой фабрики при помощи лямбды
//        new BlockLambdaDemo17(); // Применение блочного лямбда выражения (Факториал) со встроенным функ.интерфейсом

    }
}
