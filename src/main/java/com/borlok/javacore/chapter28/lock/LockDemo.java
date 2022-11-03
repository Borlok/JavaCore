package com.borlok.javacore.chapter28.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public LockDemo() {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A").start();
        new LockThread(lock, "B").start();
    }
}
