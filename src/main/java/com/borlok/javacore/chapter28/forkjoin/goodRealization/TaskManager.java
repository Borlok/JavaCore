package com.borlok.javacore.chapter28.forkjoin.goodRealization;

import java.util.concurrent.Phaser;

/**
 * @author Erofeevskiy Yuriy on 10.11.2023
 */


public class TaskManager {
    private final Phaser phaser;
    private final int phase;
    private int forkParts;

    public TaskManager() {
        phaser = new Phaser(1);
        phase = phaser.getPhase();
        forkParts = 4;
    }

    public TaskManager(int forkParts) {
        this();
        this.forkParts = forkParts;
    }

    public void addTask() {
        phaser.register();
    }

    public void addTasks(int count) {
        phaser.bulkRegister(count);
    }

    public void completeTask() {
        phaser.arriveAndDeregister();
    }

    public void await() {
        phaser.awaitAdvance(phase);
    }

    public Integer activeTasks() {
        return phaser.getRegisteredParties();
    }

    public int forksParts() {
        return forkParts;
    }

    public int phase() {
        return phaser.getPhase();
    }
}
