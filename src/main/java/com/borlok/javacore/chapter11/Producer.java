package com.borlok.javacore.chapter11;

public class Producer implements Runnable{
    Package q;

    Producer (Package q) {
        this.q = q;
        new Thread(this,"Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
