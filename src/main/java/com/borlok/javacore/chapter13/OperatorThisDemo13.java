package main.java.com.borlok.javacore.chapter13;

/**
 * Применение оператора this для вызова внутренних конструкторов
 */
public class OperatorThisDemo13 {
    int a,b;

    public OperatorThisDemo13(int i, int k) {
        a = i;
        b = k;
    }

    public OperatorThisDemo13(int i) {
        this(i,i);
    }

    public OperatorThisDemo13() {
        this(0);
    }
}
