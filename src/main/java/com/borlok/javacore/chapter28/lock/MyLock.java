package com.borlok.javacore.chapter28.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Erofeevskiy Yuriy on 15.11.2023
 */


public class MyLock {
    final static Lock lock = new ReentrantLock();
}
