package com.borlok.javacore.chapter11;

public class NewThread6 implements Runnable{
    String name;
    Thread t;
    boolean flag;

    public NewThread6(String name) {
        this.name = name;
        t = new Thread(this,name);
        System.out.println("Создан поток " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (flag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Поток " + name + " прерван");
        }
        System.out.println("Поток " + t + " завершен");
    }

    synchronized void mySuspend() {
        flag = true;
    }

    synchronized void myResume () {
        flag = false;
        notify();
    }
}
