package com.juc_25_3;

public class Text_10_3 {
    public static void main(String[] args) {
        MyThread_10 my1 = new MyThread_10();
        MyThread_10 my2 = new MyThread_10();

        my1.setName("窗口1");
        my2.setName("窗口2");

        my1.start();
        my2.start();
    }
}
