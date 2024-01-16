package com.borlok.javacore.chapter28.forkjoin.goodRealization;

import java.util.concurrent.ForkJoinPool;

/**
 * @author Erofeevskiy Yuriy on 10.11.2023
 */


public class FJRecursiveSumDemo {
    public FJRecursiveSumDemo() {
        ForkJoinPool pool = new ForkJoinPool(4);
        double[] nums = new double[10000];
        double resutl = 0;
        for (int i = 0; i < nums.length; i++) {
            resutl += i;
            nums[i] = i;
        }
        Parameters parameters = new Parameters();
        pool.submit(new AsyncTask(nums, parameters));
        parameters.tasks().await();
    }
}
