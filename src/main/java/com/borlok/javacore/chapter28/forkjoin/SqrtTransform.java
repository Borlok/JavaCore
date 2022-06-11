package main.java.com.borlok.javacore.chapter28.forkjoin;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends RecursiveAction {
    final int seqThreshold = 1000;
    double[] data;
    int start, end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
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
