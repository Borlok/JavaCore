package main.java.com.borlok.javacore.chapter28.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {
    public FJExperiment(int level, int threshold) {
        int pLevel = level;
        int pThreshold = threshold;

        long startTime, endTime;

        ForkJoinPool joinPool = new ForkJoinPool(level);

        double[] nums = new double[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform task = new Transform(nums, 0, nums.length, threshold);
        startTime = System.nanoTime();
        joinPool.invoke(task);
        endTime = System.nanoTime();

        System.out.println("Уровень параллелизма: " + level);
        System.out.println("Порог: " + threshold);
        System.out.println("Истекшее время: " + (endTime - startTime) / 1000 + " мс");
        System.out.println("Параллелизм данного компьютера: " + ForkJoinPool.getCommonPoolParallelism());
        System.out.println("Количество процессоров данного компьютера: " + Runtime.getRuntime().availableProcessors());
        System.out.println();

    }
}
