package com.text_25_2_19;

public abstract class Player extends Person{
    public Player(){}

    public Player(String name,int age){
        super(name,age);
    }
    public abstract void study();
}
