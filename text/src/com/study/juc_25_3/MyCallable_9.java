package com.study.juc_25_3;

import java.util.concurrent.Callable;

public class MyCallable_9 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
