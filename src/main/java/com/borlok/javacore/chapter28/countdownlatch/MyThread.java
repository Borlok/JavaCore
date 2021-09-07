package main.java.com.borlok.javacore.chapter28.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
    private CountDownLatch countDownLatch;

    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            countDownLatch.countDown();
        }
    }
}
