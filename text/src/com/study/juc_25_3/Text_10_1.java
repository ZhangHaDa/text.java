package com.study.juc_25_3;

public class Text_10_1 {
    public static void main(String[] args) {
        Eater_10 eater = new Eater_10();
        Cook_10 cook = new Cook_10();

        eater.setName("吃货");
        cook.setName("厨师");

        eater.start();
        cook.start();
    }
}
