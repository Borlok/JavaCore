package com.borlok.javacore.chapter11;

public class Package {
    int n;
    boolean packageIsHere = false;

    synchronized int get() {
        while (!packageIsHere) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Получено " + n);
        packageIsHere = false;
        notify();
        return n;
    }

    synchronized void put (int n) {
        try {
            while (packageIsHere) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.n = n;
        packageIsHere = true;
        System.out.println("Отправлено: " + n);
        notify();
    }


}
