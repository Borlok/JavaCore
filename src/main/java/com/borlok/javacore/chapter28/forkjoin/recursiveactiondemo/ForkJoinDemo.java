package com.borlok.javacore.chapter28.forkjoin.recursiveactiondemo;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public ForkJoinDemo() {
        ForkJoinPool joinPool = new ForkJoinPool();
//        ForkJoinPool joinPool = ForkJoinPool.commonPool(); Вызов общего пула

        double[] nums = new double[100000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        System.out.println("Часть исходной последовательности: ");
        for (int i = 0; i < 10; i++)
            System.out.print(nums[i] + " ");
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        joinPool.invoke(task); // Так же можно не вызывать joinPool и даже не создавать его, а просто написать task.invoke()
        //тогда вызовется общий пул.

        System.out.println("Часть преобразованной последовательности:");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.4f ", nums[i]);
        }
        System.out.println();
    }
}
