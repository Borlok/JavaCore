package com.borlok.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public SemaphoreDemo() {
        Semaphore semaphore = new Semaphore(1);

        new IncThread(semaphore, "A");
        new DecThread(semaphore, "B");
    }
}
