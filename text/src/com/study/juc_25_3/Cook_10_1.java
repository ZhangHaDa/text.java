package com.study.juc_25_3;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook_10_1 extends  Thread{
    ArrayBlockingQueue<String> queue;

    public Cook_10_1(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                queue.put("面");
                System.out.println("出面");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
