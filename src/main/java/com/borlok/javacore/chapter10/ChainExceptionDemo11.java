package com.borlok.javacore.chapter10;

/**
 * Пример цепочек исключений
 */
public class ChainExceptionDemo11 {

    public ChainExceptionDemo11() {
        NullPointerException e = new NullPointerException("Верхний уровень");
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }
}
