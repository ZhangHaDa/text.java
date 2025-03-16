package com.juc_25_3;

public class ThreadNumber_10 extends Thread{
    static int num = 1;

    @Override
    public void run() {
        while(true){
            synchronized (ThreadNumber_10.class){
                if(num>100){
                    break;
                }else{
                    if(num%2==0){
                        num++;
                        continue;
                    }else{
                        System.out.println(getName()+num);
                        num++;
                    }
                }
            }
        }
    }
}
