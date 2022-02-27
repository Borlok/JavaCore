package main.java.com.borlok.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

public class MakeString extends Thread{
    Exchanger<String> exchanger;
    String text;
    public MakeString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        text = "";
    }

    public void run() {
        char ch = 'A';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                text += (char) ch++;
            }
            try {
                text = exchanger.exchange(text);
                System.out.println("Make String: " + text);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
