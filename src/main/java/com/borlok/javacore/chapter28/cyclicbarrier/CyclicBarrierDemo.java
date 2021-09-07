package main.java.com.borlok.javacore.chapter28.cyclicbarrier;

import main.java.com.borlok.javacore.chapter28.countdownlatch.MyThread;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public CyclicBarrierDemo() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());
        System.out.println("Запуск потоков");
        new MyThread2(cyclicBarrier, "A");
        new MyThread2(cyclicBarrier, "B");
        new MyThread2(cyclicBarrier, "C");

    }
}
