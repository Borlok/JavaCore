package com.borlok.javacore.chapter28.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public CountDownLatchDemo() {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения");

        new Thread(new MyThread(countDownLatch)).start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потока исполнения");
    }
}
