package main.java.com.borlok.javacore.chapter28.executor;

import java.util.concurrent.CountDownLatch;

public class MyThread4 implements Runnable {
    private CountDownLatch countDownLatch;
    private String name;

    public MyThread4(CountDownLatch countDownLatch, String name) {
        this.countDownLatch = countDownLatch;
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + name + ": " + i);
            countDownLatch.countDown();
        }
    }
}
