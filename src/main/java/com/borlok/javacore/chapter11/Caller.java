package main.java.com.borlok.javacore.chapter11;

public class Caller implements Runnable{
    CallMe target;
    String msg;
    Thread t;

    public Caller(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) { // С помощью synchronized для объекта
            target.call(msg);
        }
    }
}
