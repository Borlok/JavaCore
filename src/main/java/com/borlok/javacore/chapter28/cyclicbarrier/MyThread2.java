package main.java.com.borlok.javacore.chapter28.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread2 implements Runnable{
    private final String name;
    private CyclicBarrier cyclicBarrier;

    public MyThread2(CyclicBarrier cyclicBarrier, String a) {
        name = a;
        this.cyclicBarrier = cyclicBarrier;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
