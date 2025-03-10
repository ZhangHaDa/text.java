package com.study.juc_25_3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread_10_1 extends Thread{
    static int ticket = 1;
    static  Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            lock.lock();
            try {
                if(ticket==101){
                    break;
                }else{
                    Thread.sleep(10);
                    System.out.println(getName()+"售卖了第"+ticket+"票");
                    ticket++;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
