package com.juc_25_3;

public class MyThread_10_1 extends Thread{
    static  int gift = 100;

    @Override
    public void run() {
        while(true){
            synchronized (MyThread_10_1.class) {
                if(gift<10){
                    break;
                }else{
                    gift--;
                    System.out.println(getName()+"送出一个礼物还剩"+gift);
                }
            }
        }
    }
}
