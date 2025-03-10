package com.study.juc_25_3;

import com.study_25_3.Game_5;

import java.io.IOException;
import java.text.ParseException;

public class Text_10_0 {
    public static void main(String[] args) throws IOException, ParseException {
//        MyThread_10 my1 = new MyThread_10();
//        MyThread_10 my2 = new MyThread_10();
//        MyThread_10 my3 = new MyThread_10();
//        my1.setName("售票口1:");
//        my2.setName("售票口2:");
//        my3.setName("售票口3:");
//
//        my1.start();
//        my2.start();
//        my3.start();


//        MyRun_10 mr = new MyRun_10();
//
//        Thread t1 = new Thread(mr,"售票口1:");
//        Thread t2 = new Thread(mr,"售票口2:");
//        Thread t3 = new Thread(mr,"售票口3:");
//
//
//        t1.start();
//        t2.start();
//        t3.start();

//        MyThread_10_1 my1 = new MyThread_10_1();
//        MyThread_10_1 my2 = new MyThread_10_1();
//        MyThread_10_1 my3 = new MyThread_10_1();
//        my1.setName("售票口1:");
//        my2.setName("售票口2:");
//        my3.setName("售票口3:");
//
//        my1.start();
//        my2.start();
//        my3.start();
        Game_5 game = new Game_5();
        game.run();
    }
}
