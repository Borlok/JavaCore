package com.borlok.javacore.chapter11;

public class NewThread55 implements Runnable{
    private String name;
    Thread t;

    public NewThread55 (String name) {
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Поток " + name + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Ошибка в потоке: " + name + " " + e);
        }
        System.out.println("Поток " + name + " завершен.");
    }
}
