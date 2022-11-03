package com.borlok.javacore.chapter28.atomic;

public class AtopThread extends Thread{
    private String name;

    public AtopThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока: " + name);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Поток: " + name + " получено: " + Shared.ai.getAndSet(i));
        }
    }
}
