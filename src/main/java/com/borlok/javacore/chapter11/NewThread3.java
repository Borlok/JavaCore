package com.borlok.javacore.chapter11;

public class NewThread3 extends Thread{
    public NewThread3() {
        super("дочерний поток");
        System.out.println("Дочерний поток: " + this);
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.err.println("Проблема в дочернем потоке: " + e);
        }
        System.out.println("Дочерний поток завершен");
    }
}
