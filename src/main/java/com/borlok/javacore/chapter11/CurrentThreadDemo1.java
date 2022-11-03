package com.borlok.javacore.chapter11;

public class CurrentThreadDemo1 {
    public CurrentThreadDemo1() {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток выполнения: " + t);
        t.setName("MyThread");
        System.out.println("Поток после изменения имени: " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Главный поток исполнения прерван: " + e);
        }
    }
}
