package com.borlok.javacore.chapter11;

public class NewThread5 implements Runnable{
    private String name;
    Thread t;
    public NewThread5(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Поток " + name + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Ошибка в потоке: " + name + " " + e);
        }
        System.out.println("Поток " + name + " завершен.");
    }
}
