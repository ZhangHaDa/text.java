package com.study.juc_25_3;

public class MyRun_9 implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName()+"hello world");
        }
    }
}
