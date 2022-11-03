package com.borlok.javacore.chapter10.Exceptions;

public class MyException extends Exception{
    private int def;

    public MyException() {
    }

    public MyException(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "MyException {" +
                def +
                "}";
    }
}
