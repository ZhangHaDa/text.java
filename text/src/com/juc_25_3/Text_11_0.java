package com.juc_25_3;

import java.util.concurrent.*;

public class Text_11_0 {
    public static void main(String[] args) {
//        ExecutorService e = Executors.newFixedThreadPool(3);
//        //MyRun_11 r = new MyRun_11();
//        e.submit(new MyRun_11());
//        e.submit(new MyRun_11());
//        e.submit(new MyRun_11());
//        e.submit(new MyRun_11());

        new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

    }
}
