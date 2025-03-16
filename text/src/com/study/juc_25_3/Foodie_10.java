package com.study.juc_25_3;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie_10 extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie_10(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                String food = queue.take();
                System.out.println(food+"123");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
