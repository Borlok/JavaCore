package com.borlok.javacore.chapter15.lambda;

public class MyArrayOps12 {
    static <T> int countMatching(T[]t1, T t2) {
        int count = 0;

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] == t2) count++;
        }
        return count;
    }
}
