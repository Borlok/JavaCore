package com.borlok.javacore.chapter11;

public class NewThread4 implements Runnable{
    private String name;

    public NewThread4(String name) {
        Thread t = new Thread(this, name);
        this.name = name;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Ошибка в потоке: " + name + " " + e);
        }
    }
}
