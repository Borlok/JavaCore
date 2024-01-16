package com.borlok.javacore.chapter28.forkjoin.goodRealization;

import java.util.concurrent.CompletableFuture;

/**
 * @author Erofeevskiy Yuriy on 10.11.2023
 */


public class Parameters {
    private final TaskManager taskManager;
    private final CompletableFuture<Double> result;

    public Parameters() {
        this(5);
    }

    public Parameters(int forkParts) {
        taskManager = new TaskManager(Math.max(2, forkParts));
        result = new CompletableFuture<>();
    }

    public CompletableFuture<Double> result() {
        return result;
    }

    public TaskManager tasks() {
        return taskManager;
    }
}
