package com.borlok.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

public class MyThread3 extends Thread {
    private Phaser phaser;
    private String name;

    public MyThread3(Phaser phaser, String a) {
        this.phaser = phaser;
        name = a;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phaser.arriveAndDeregister();
    }
}
