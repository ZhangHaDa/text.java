package com.juc_25_3;

public class Text_10_5 {
    public static void main(String[] args) {
        ThreadNumber_10 n1 = new ThreadNumber_10();
        ThreadNumber_10 n2 = new ThreadNumber_10();

        n1.setName("1:");
        n2.setName("2:");

        n1.start();
        n2.start();
    }
}
