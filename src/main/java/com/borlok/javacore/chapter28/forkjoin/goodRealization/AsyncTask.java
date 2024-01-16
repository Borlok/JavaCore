package com.borlok.javacore.chapter28.forkjoin.goodRealization;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.RecursiveAction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Erofeevskiy Yuriy on 10.11.2023
 */


public class AsyncTask extends RecursiveAction {
    private final int MIN_LENGTH = 4000;
    private final Parameters asyncParameters;
    private final double[] nums;

    public AsyncTask(double[] nums, Parameters asyncParameters) {
        this.asyncParameters = asyncParameters;
        this.nums = nums;
    }

    @Override
    protected void compute() {
        try {
            System.out.println("Start task - " + nums.length); // TODO Delete
            System.out.println("Is done? " + asyncParameters.result().isDone()); // TODO Delete
            System.out.println("nums.length? " + nums.length); // TODO Delete
            if (nums.length < MIN_LENGTH)
                execute();
            else {
                divide();
            }
        } finally {
            asyncParameters.tasks().completeTask();
            System.out.println("Active tasks: " + asyncParameters.tasks().activeTasks()); // TODO Delete
            System.out.println("Task is done - " + nums.length + "\n=================\n"); // TODO Delete
            if (asyncParameters.tasks().activeTasks() <= 0) {
                System.out.println("--------------------"); // TODO Delete
                System.out.println("Tasks no more"); // TODO Delete
                System.out.println("--------------------"); // TODO Delete}
            }
        }
    }

    private void execute() {
        System.out.println("Execute"); // TODO Delete
        double result = 0;
        for (double num : nums)
            result += num;
    }

    private void divide() {
        int size = nums.length, parts = asyncParameters.tasks().forksParts(), remains = size % parts, step = size / parts, dividedStep = step / 2, leftEnd = 0, leftStart, rightStart = size, rightEnd;
        System.out.printf("All size = %d | Step = %d | Parts = %d\n", size, step, parts); // TODO Delete
        while (leftEnd < rightStart) {
            asyncParameters.tasks().addTask();
            leftStart = leftEnd;
            rightEnd = rightStart;
            leftEnd += Math.min(rightEnd - leftStart - dividedStep, dividedStep + remains);
            rightStart -= dividedStep;
            new AsyncTask(Arrays.copyOfRange(nums, leftStart, leftEnd), asyncParameters).fork();
            new AsyncTask(Arrays.copyOfRange(nums, rightStart, rightEnd), asyncParameters).fork();
        }
    }
}
