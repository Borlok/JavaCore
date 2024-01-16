package com.borlok.javacore.chapter28;

import com.borlok.javacore.chapter28.atomic.AtomicDemo;
import com.borlok.javacore.chapter28.callable.CallableDemo;
import com.borlok.javacore.chapter28.countdownlatch.CountDownLatchDemo;
import com.borlok.javacore.chapter28.cyclicbarrier.CyclicBarrierDemo;
import com.borlok.javacore.chapter28.exchanger.ExchangerDemo;
import com.borlok.javacore.chapter28.executor.ExecutorDemo;
import com.borlok.javacore.chapter28.forkjoin.goodRealization.FJRecursiveSumDemo;
import com.borlok.javacore.chapter28.forkjoin.recursiveactiondemo.FJExperiment;
import com.borlok.javacore.chapter28.forkjoin.recursiveactiondemo.ForkJoinDemo;
import com.borlok.javacore.chapter28.forkjoin.recursivetaskdemo.RecursiveTaskDemo;
import com.borlok.javacore.chapter28.lock.LockDemo;
import com.borlok.javacore.chapter28.phaser.PhaserDemo;
import com.borlok.javacore.chapter28.semaphore.SemaphoreDemo;

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
//        new FJExperiment(1, 50000); // Fork join для эксперементов
//        new RecursiveTaskDemo(); // Демо recursive task
        new FJRecursiveSumDemo(); // Правильная реализация FJP
        System.out.println("Основной поток завершен");
    }
}
