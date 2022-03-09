package main.java.com.borlok.javacore.chapter28.executor;


import java.util.concurrent.*;

public class ExecutorDemo {
    public ExecutorDemo() {
        CountDownLatch cdl = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println("Зaпycк потоков");
        es.execute(new MyThread4(cdl, "А"));
        es.execute(new MyThread4(cdl2, "В"));
        es.execute(new MyThread4(cdl3, "С"));
        es. execute ( new MyThread4 ( cdl4, "D") ) ;
        try {
            cdl.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        es.shutdown();
        System.out.println("Завершение потоков");
    }
}
