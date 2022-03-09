package main.java.com.borlok.javacore.chapter28.atomic;

public class AtomicDemo {
    public AtomicDemo() {
        new AtopThread("A").start();
        new AtopThread("B").start();
        new AtopThread("C").start();
    }
}
