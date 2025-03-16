package com.study.juc_25_3;

public class Cook_10 extends Thread{

    @Override
    public void run() {
        while (true) {
            synchronized (Desk_10.lock) {
                if (Desk_10.count == 0) {
                    break;
                } else {
                    if (Desk_10.flagNumber == 1) {
                        try {
                            System.out.println("有面");
                            Desk_10.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("厨师正在出面");
                        Desk_10.flagNumber = 1;
                        Desk_10.lock.notifyAll();
                    }
                }

            }

        }
    }
}
