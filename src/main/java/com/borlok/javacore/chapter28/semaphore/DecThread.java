package com.borlok.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable{
    private final String name;
    private final Semaphore semaphore;

    public DecThread(Semaphore semaphore, String name) {
        Thread t = new Thread(this);
        this.semaphore = semaphore;
        this.name = name;
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            System.out.println("Поток " + name + " ожидает разрешения");
            semaphore.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + "; " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + name + " освобождает разрешение");
        semaphore.release();
    }
}
