package main.java.com.borlok.javacore.chapter28;

import main.java.com.borlok.javacore.chapter28.countdownlatch.CountDownLatchDemo;
import main.java.com.borlok.javacore.chapter28.cyclicbarrier.CyclicBarrierDemo;
import main.java.com.borlok.javacore.chapter28.semaphore.SemaphoreDemo;

public class Main {
    public static void main(String[] args) {
//        new SemaphoreDemo(); // Пример класса семафора
//        new CountDownLatchDemo(); // Пример countDownLatch
        new CyclicBarrierDemo(); // Пример cyclicBarrier
    }
}
