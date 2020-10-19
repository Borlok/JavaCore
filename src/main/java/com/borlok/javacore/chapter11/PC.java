package main.java.com.borlok.javacore.chapter11;

public class PC {
    public PC() {
        Package q = new Package();
        new Producer(q);
        new Consumer(q);
        System.out.println("Для остановки нажмите ctrl+c");
    }
}
