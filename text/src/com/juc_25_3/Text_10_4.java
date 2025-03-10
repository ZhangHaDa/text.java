package com.juc_25_3;

public class Text_10_4 {
    public static void main(String[] args) {
        MyThread_10_1 my1 = new MyThread_10_1();
        MyThread_10_1 my2 = new MyThread_10_1();

        my1.setName("窗口1");
        my2.setName("窗口2");

        my1.start();
        my2.start();
    }
}
