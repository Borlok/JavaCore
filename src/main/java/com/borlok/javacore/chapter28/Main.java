package main.java.com.borlok.javacore.chapter28;

import main.java.com.borlok.javacore.chapter28.atomic.AtomicDemo;
import main.java.com.borlok.javacore.chapter28.callable.CallableDemo;
import main.java.com.borlok.javacore.chapter28.countdownlatch.CountDownLatchDemo;
import main.java.com.borlok.javacore.chapter28.cyclicbarrier.CyclicBarrierDemo;
import main.java.com.borlok.javacore.chapter28.exchanger.ExchangerDemo;
import main.java.com.borlok.javacore.chapter28.executor.ExecutorDemo;
import main.java.com.borlok.javacore.chapter28.forkjoin.FJExperiment;
import main.java.com.borlok.javacore.chapter28.forkjoin.ForkJoinDemo;
import main.java.com.borlok.javacore.chapter28.lock.LockDemo;
import main.java.com.borlok.javacore.chapter28.phaser.PhaserDemo;
import main.java.com.borlok.javacore.chapter28.semaphore.SemaphoreDemo;

public class Main {
    public static void main(String[] args) {
//        new SemaphoreDemo(); // Пример класса семафора
//        new CountDownLatchDemo(); // Пример countDownLatch
//        new CyclicBarrierDemo(); // Пример cyclicBarrier
//        new ExchangerDemo(); // Пример exchanger
//        new PhaserDemo(); // Пример фазера
//        new ExecutorDemo(); // Executor demo
//        new CallableDemo(); // Callable demo
//        new LockDemo(); // Lock demo
//        new AtomicDemo(); // Atomic demo
//        new ForkJoinDemo(); // ForkJoin demo
        new FJExperiment(3, 50000); // Fork join для эксперементов
    }
}
