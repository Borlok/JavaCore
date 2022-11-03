package com.borlok.javacore.chapter15.exceptions;

public class EmptyArrayException extends Exception{
    public EmptyArrayException() {
        super("Массив пуст");
    }
}
