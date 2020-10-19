package main.java.com.borlok.javacore.chapter11;

public class Consumer implements Runnable{
    Package q;

    public Consumer(Package q) {
        this.q = q;
        new Thread(this,"Потребитель").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
