package main.java.com.borlok.javacore.chapter11;

public class DeadLock implements Runnable{
    Thread t;
    A a = new A();
    B b = new B();

    public DeadLock() {
        Thread.currentThread().setName("Главный поток");
        t = new Thread(this,"Соперничащий поток");
        t.start();
        a.foo(b);
        System.out.println("Назад в главный поток");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Назад в другой поток");
    }
}
