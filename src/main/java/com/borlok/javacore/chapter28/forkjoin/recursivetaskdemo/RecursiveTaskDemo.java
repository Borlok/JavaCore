package com.borlok.javacore.chapter28.forkjoin.recursivetaskdemo;

import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskDemo {

    public RecursiveTaskDemo() {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        double [] nums = new double[5000];

        for (int i = 0; i < nums.length; i++)
            nums [i] = (((i & 1) == 0) ? i : -i);

        Sum task = new Sum(nums, 0, nums.length);

        double summation = forkJoinPool.invoke(task);

        System.out.println("Суммирование " + summation);
    }
}
