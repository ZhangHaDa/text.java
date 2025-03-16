package com.study.juc_25_3;

import java.util.concurrent.ArrayBlockingQueue;

public class Text_10_2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        Cook_10_1 cook = new Cook_10_1(queue);
        Foodie_10 foodie = new Foodie_10(queue);

        cook.start();
        foodie.start();
    }


}
