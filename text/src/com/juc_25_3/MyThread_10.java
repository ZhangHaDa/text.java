package com.juc_25_3;

public class MyThread_10 extends Thread{

    static int ticket = 1;
    @Override
    public void run() {
        while(true){
            synchronized(MyThread_10.class){
                if(ticket==1001){
                    break;
                }else {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"领取了一张票,还剩"+(1001-ticket)+"票");
                }
            }
        }

    }
}
