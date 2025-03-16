package com.study.juc_25_3;

public class Eater_10 extends Thread{
    /*
    1循环
    2代码块
    3到末尾
    4没有到末尾
     */

    @Override
    public void run() {
        while(true){
            synchronized(Desk_10.lock){
                if(Desk_10.count==0){
                    break;
                }else{
                    if(Desk_10.flagNumber==0){
                        try {
                            System.out.println("需要等待!");
                            Desk_10.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        Desk_10.count--;
                        System.out.println(getName()+"还能吃"+Desk_10.count+"碗");
                        Desk_10.flagNumber = 0;
                        Desk_10.lock.notifyAll();
                    }
                }
            }
        }

    }
}
