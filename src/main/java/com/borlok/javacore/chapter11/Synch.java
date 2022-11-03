package com.borlok.javacore.chapter11;

public class Synch {
    public Synch() {
        CallMe target = new CallMe();

        Caller c1 = new Caller(target,"Добро пожаловать");
        Caller c2 = new Caller(target,"в синхронизированный");
        Caller c3 = new Caller(target,"мир!!!");

        try {
            c1.t.join();
            c2.t.join();
            c3.t.join();
        } catch (InterruptedException e) {
            System.err.println("Прервано " + e);
        }
    }
}
