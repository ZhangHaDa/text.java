package com.juc_25_3;

public class Text_10_6 {
    public static void main(String[] args) {
        ThreadRed_10 t1 = new ThreadRed_10();
        ThreadRed_10 t2 = new ThreadRed_10();
        ThreadRed_10 t3 = new ThreadRed_10();
        ThreadRed_10 t4 = new ThreadRed_10();
        ThreadRed_10 t5 = new ThreadRed_10();


        t1.setName("q");
        t2.setName("a");
        t3.setName("z");
        t4.setName("p");
        t5.setName("l");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
