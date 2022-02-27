package main.java.com.borlok.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

public class UseString extends Thread{
    Exchanger<String> exchanger;
    String text;
    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        text = "";
    }

    public void run () {
        for (int i = 0; i < 3; i++) {
            try
            {
                text = exchanger.exchange("");
                System.out.println("Получено: " + text);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
