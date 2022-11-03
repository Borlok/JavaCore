package com.borlok.javacore.chapter11;

public class Ex implements Runnable{
    public Ex() {

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("Runnable without Thread: "
                        + Thread.currentThread().getName() + " "
                        + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
