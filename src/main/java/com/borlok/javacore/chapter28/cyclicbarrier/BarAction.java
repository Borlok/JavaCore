package com.borlok.javacore.chapter28.cyclicbarrier;

public class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достикнут!");
    }
}
