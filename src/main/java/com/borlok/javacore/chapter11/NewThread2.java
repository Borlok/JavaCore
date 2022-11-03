package com.borlok.javacore.chapter11;

public class NewThread2 implements Runnable {
    public NewThread2() {
        Thread t = new Thread(this,"Дочерний поток");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.err.println("Ошибка в дочернем поотоке: " + e);
        }
        System.out.println("Дочерний поток зваершен.");
    }
}
