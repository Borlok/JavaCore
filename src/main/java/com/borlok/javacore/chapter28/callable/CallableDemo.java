package main.java.com.borlok.javacore.chapter28.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public CallableDemo() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> f1, f3;
        Future<Double> f2;
        System.out.println("Запуск");
        f1 = executorService.submit(new Sum(10));
        f2 = executorService.submit(new Hypot(3, 4));
        f3 = executorService.submit(new Factorial(5));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println("Завершение");
    }
}
