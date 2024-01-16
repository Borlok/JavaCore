package com.borlok.javacore.chapter28.forkjoin.recursiveactiondemo;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends CountedCompleter<Void> {
    final int seqThreshold = 1000;
    double[] data;
    int start, end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    public void compute() {
        if ((end - start) < seqThreshold)
            for (int i = start; i < end; i++)
                if ((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]);
        else {
            int middle = (start + end) / 2;
            invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
        }
    }
}
