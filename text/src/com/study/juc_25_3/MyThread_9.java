package com.study.juc_25_3;

public class MyThread_9 extends Thread{

    public MyThread_9(String name) {
        super(name);
    }

    public MyThread_9() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(100L);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(getName()+"Hello world");
            Thread.yield();
        }
    }
}
