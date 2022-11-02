package main.java.com.borlok.javacore.chapter11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
//        new CurrentThreadDemo1(); // Пример управления главным потоком


//        new NewThread2(); // Пример реализации интерфейса Runnable
//        new NewThread3(); // Пример реализации расширением класса Thread
//        try {
//            for (int i = 100; i > 0; i--) {
//                System.out.println("Главный поток: "
//                        + Thread.currentThread().getName() + " " + i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.err.println("Ошибка в главном потоке: " + e);
//        }
        //////////////////// Конец примера

//        new NewThread4("Один"); // Пример реализации нескольких потоков
//        new NewThread4("Два"); // Пример реализации нескольких потоков
//        new NewThread4("три"); // Пример реализации нескольких потоков
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            System.err.println("Что то пошло не так в главном потоке");
//        }
//        System.out.println("Главный поток завершен");
        //////////////////// Конец примера

//        NewThread5 t1 = new NewThread5("Один"); // Пример реализации метода join()
//        NewThread5 t2 = new NewThread5("Два"); // Пример реализации метода join()
//        NewThread5 t3 = new NewThread5("Три"); // Пример реализации метода join()
//
//        System.out.println("Поток " + t1.t.getName() + " запущен: " + t1.t.isAlive());
//        System.out.println("Поток " + t2.t.getName() + " запущен: " + t2.t.isAlive());
//        System.out.println("Поток " + t3.t.getName() + " запущен: " + t3.t.isAlive());
//
//        try {
//            System.out.println("Ожидание завершения потоков:");
//            t1.t.join();
//            t2.t.join();
//            t3.t.join();
//        } catch (InterruptedException e) {
//            System.out.println("Главный поток прерван: " + e);
//        }
//        System.out.println("Поток " + t1.t.getName() + " запущен: " + t1.t.isAlive());
//        System.out.println("Поток " + t2.t.getName() + " запущен: " + t2.t.isAlive());
//        System.out.println("Поток " + t3.t.getName() + " запущен: " + t3.t.isAlive());
//        System.out.println("Главный поток завершен");
        //////////////////// Конец примера

        new Synch(); // Пример без синхронизации\С синхронизацией

//        new PC(); // Пример правильной синхронизации
//        new DeadLock(); // Пример DeadLock
//        new SuspendResume(); // Пример своих методов приостановки и возобновления потоков
    }
}
