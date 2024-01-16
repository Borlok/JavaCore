package com.borlok.javacore.chapter28.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Erofeevskiy Yuriy on 01.11.2023
 */


public class LockThread2 extends Thread {
    private final ReentrantLock lock;
    private final String name;

    public LockThread2(ReentrantLock lock, String b) {
        this.lock = lock;
        this.name = b;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока: " + name);
        try {
            System.out.println("Поток: " + name + " ожидает блокировки счетчика");
            MyLock.lock.lock();
            System.out.println("Поток: " + name + " блокирует счетчик.");
            Shared.count++;
            System.out.println("Поток: " + name + " " + Shared.count);
            System.out.println("Поток: " + name + " ожидает");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Поток: " + name + " разблокирует счетчик");
            MyLock.lock.unlock();
        }
    }
}
