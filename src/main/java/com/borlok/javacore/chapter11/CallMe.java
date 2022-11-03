package com.borlok.javacore.chapter11;

public class CallMe {
    public void call(String msg) { // public synchronized void call(String msg)
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано: " + e);
        }
        System.out.println("]");
    }
}
