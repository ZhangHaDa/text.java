package com.text_25_2_19;

public class BasketballPlayer extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("教英语");
    }

    @Override
    public void english() {
        System.out.println("说英语");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
}
