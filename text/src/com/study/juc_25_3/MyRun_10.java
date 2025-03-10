package com.study.juc_25_3;

public class MyRun_10 implements Runnable{
    int ticket = 1;
    @Override
    public void run() {
        while(true){
                if (toTicket()) break;


        }
    }

    private  synchronized boolean toTicket() {
        if (ticket == 101) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "售卖第" + ticket + "票");
            ticket++;
        }
        return false;
    }
}
