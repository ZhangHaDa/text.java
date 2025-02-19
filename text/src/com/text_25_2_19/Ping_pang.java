package com.text_25_2_19;

public class Ping_pang extends Player implements English{
    @Override
    public void english() {
        System.out.println("说英语");
    }

    @Override
    public void study() {
        System.out.println("学乒乓球");
    }

    public Ping_pang() {
    }

    public Ping_pang(String name, int age) {
        super(name, age);
    }
}
