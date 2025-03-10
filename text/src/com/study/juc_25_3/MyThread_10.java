package com.study.juc_25_3;

public class MyThread_10 extends Thread{

    static int t = 1;
    @Override
    public void run() {
        while(true){
            synchronized (MyThread_10.class) {
                if(t<=100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName()+"售卖了第"+t+"票");
                    t++;
                }else{
                    System.out.println("票已经售完");
                    break;
                }
            }
        }

    }
}
