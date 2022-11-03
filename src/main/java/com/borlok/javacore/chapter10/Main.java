package com.borlok.javacore.chapter10;

import com.borlok.javacore.chapter10.Exceptions.MyException;

/**
 * Глава, посвященная обработке исключений
 */
public class Main {
    public static void main(String[] args)  {
        new Exception1(); //  Использование операторов try/catch (простой пример)
        new HandleException2(); //Обрабатывает число, равное нулю, при делении.
        new MultipleCatchesException3(0); // Применение нескольких операторов catch (значения параметров: 0 - 2)
        new SuperSubCatchException4(); // Недостижимый код (не скомпилируется если раскомментировать внутри класса)
        new NestTryException5(1); // Пример применения вложеных операторов try (значения параметров: 0 - 2)

        try { // Пример неявно вложенных операторов try (значения a: 0 - 2)
            int a = 0;
            int b = 42 / a;
            System.out.println("a = " + a);
            new MethNestTryException6(a);
        } catch (ArithmeticException e ) {
            System.out.println("Деление на ноль: " + e);
        }
        /////////////////////// Конец примера

        try { // Пример применения оператора throw
            ThrowDemoException7.demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват " + e);
        }
        /////////////////////// Конец примера

        try { // Пример применения оператора throws
            ThrowsDemoException8.throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перхвачено исключение " + e);
        }
        /////////////////////// Конец примера

        try {
            FinallyDemoException9.procA(); // Генерация исключения в методе
        } catch (RuntimeException e) {
            System.out.println("Исключение перехвачено " + e);
        }
        FinallyDemoException9.procB(); // Возврат управления из блока try при помощи return
        FinallyDemoException9.procC(); // Обычное применение блока try
        /////////////////////// Конец примера

        try { // Пример создания собственных исключений
            new ExceptionDemo10(1); // При значении менее 10 - программа завершается нормально.
            new ExceptionDemo10(20); // иначе выбрасывается исключение
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
        /////////////////////// Конец примера

        try { // Пример цепочек исключений
            new ChainExceptionDemo11();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("Первопричина: " + e.getCause());
        }
        /////////////////////// Конец примера

        new MultiCatchException12(); // Пример многократного перехвата


        System.out.println("Код после блоков try/catch");
    }

}
