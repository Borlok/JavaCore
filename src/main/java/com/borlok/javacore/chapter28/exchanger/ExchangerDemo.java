package com.borlok.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public ExchangerDemo() {
        Exchanger<String> exchanger = new Exchanger<>();
        new MakeString(exchanger).start();
        new UseString(exchanger).start();
    }
}
