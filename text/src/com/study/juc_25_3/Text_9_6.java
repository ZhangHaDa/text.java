package com.study.juc_25_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Text_9_6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread_9 mt1 = new MyThread_9();
//        MyThread_9 mt2 = new MyThread_9();
//        mt1.setName("线程1");
//        mt2.setName("线程2");
//        mt1.start();
//        mt2.start();

//        MyRun_9 mr = new MyRun_9();
//        Thread t1 = new Thread(mr);
//        t1.setName("线程1");
//
//        Thread t2 = new Thread(mr);
//        t2.setName("线程2");
//
//        t1.start();
//        t2.start();

//        MyCallable_9 mc = new MyCallable_9();
//
//        FutureTask<Integer> ft = new FutureTask<>(mc);
//
//
//        Thread t = new Thread(ft);
//
//        t.start();
//
//        Integer i = ft.get();
//        System.out.println(i);


//        MyThread_9 mt1 = new MyThread_9("飞机");
//        MyThread_9 mt2 = new MyThread_9("坦克");
//
//        mt1.start();
//        mt2.start();
//
//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//
//        System.out.println(11111);
//        Thread.sleep(5000L);
//        System.out.println(22222);


//        MyRun_9 mr = new MyRun_9();
//        Thread t1 = new Thread(mr,"飞机");
//        Thread t2 = new Thread(mr,"坦克");
//
//        int t = t1.getPriority();
//        System.out.println(t);
//
//        t1.setPriority(1);
//        t2.setPriority(10);
//
//        t1.start();
//        t2.start();


        MyThread_9 my1 = new MyThread_9("女");
        MyThread_9 my2 = new MyThread_9("狗");
//        MyRun_9 mr = new MyRun_9();
//        Thread t = new Thread(mr,"坦克");

        //my2.setDaemon(true);
        System.out.println(my1.getPriority());
        System.out.println(my2.getPriority());
        my1.start();
        my2.start();

    }
}
