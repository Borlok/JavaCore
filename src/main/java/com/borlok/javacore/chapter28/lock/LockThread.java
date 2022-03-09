package main.java.com.borlok.javacore.chapter28.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread extends Thread{
    private ReentrantLock lock;
    private String name;

    public LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока: " + name);
        try {
            System.out.println("Поток: " + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток: " + name + " блокирует счетчик.");
            Shared.count++;
            System.out.println("Поток: " + name + " " + Shared.count);
            System.out.println("Поток: " + name + " ожидает");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Поток: " + name + " разблокирует счетчик");
            lock.unlock();
        }
    }
}
