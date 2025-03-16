package com.study.juc_25_3;

public class MyThread_9_1 extends Thread{
    public MyThread_9_1(String name) {
        super(name);
    }

    public MyThread_9_1() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"你好"+i);
        }

    }
}
