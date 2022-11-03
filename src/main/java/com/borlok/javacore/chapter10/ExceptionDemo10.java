package com.borlok.javacore.chapter10;

import com.borlok.javacore.chapter10.Exceptions.MyException;

/**
 * Пример создания собственных исключений
 */
public class ExceptionDemo10 {
    public ExceptionDemo10(int value) throws MyException {
        System.out.println("Значение value = " + value);
        if (value > 10)
            throw new MyException(value);
        System.out.println("Нормальное завершение");
    }
}
