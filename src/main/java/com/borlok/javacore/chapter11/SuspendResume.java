package com.borlok.javacore.chapter11;

public class SuspendResume {
    public SuspendResume() {
        NewThread6 t1 = new NewThread6("Один");
        NewThread6 t2 = new NewThread6("Два");

        try {
             Thread.sleep(1000);
             t1.mySuspend();
            System.out.println("Приостановка потока " + t1.t.getName());
            Thread.sleep(1000);
            t1.myResume();
            System.out.println("Возобновление потока " + t1.t.getName());
            Thread.sleep(1000);
            t2.mySuspend();
            System.out.println("Приостановка потока " + t2.t.getName());
            Thread.sleep(1000);
            t2.myResume();
            System.out.println("Возобновление потока " + t2.t.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Главный поток завершен");
    }
}
