package com.borlok.javacore.chapter28.phaser;

import com.borlok.javacore.chapter28.countdownlatch.MyThread;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public PhaserDemo() {
        Phaser phaser = new Phaser(1);
        int currentPhase;
        System.out.println("Запуск потоков");
        new MyThread3(phaser, "A").start();
        new MyThread3(phaser, "B").start();
        new MyThread3(phaser, "C").start();

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + currentPhase + " завершена");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + currentPhase + " завершена");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + currentPhase + " завершена");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated())
            System.out.println("Синхронизатор фаз завершен");
    }
}
