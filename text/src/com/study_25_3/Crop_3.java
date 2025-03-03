package com.study_25_3;

import java.util.Date;
import java.util.Random;

public class Crop_3 {
    private String name;
    private Date plantDate;
    private int fertility;
    private int humidity;
    private int growth;
    private int product;

    public Crop_3() {
        this.name = "CROP";
        this.plantDate = new Date();
        this.fertility = this.humidity = 50;
        this.growth = this.product = 0;
    }


    public Crop_3(String name,  int fertility, int humidity) {
        this.name = name;
        this.plantDate = new Date();
        this.fertility = fertility;
        this.humidity = humidity;
        this.growth = this.product =0;
        //this.product = product;
    }

    public Crop_3(String name, int fertility, int humidity, int growth, int product) {
        this.name = name;
        this.plantDate = new Date();
        this.fertility = fertility;
        this.humidity = humidity;
        this.growth = growth;
        this.product = product;
    }

    public void fertilize(){
        Random r = new Random();
    }

    public void water(){}

    public void showDetail(){
        System.out.println("******************Crop Information *****************");
        System.out.println("Name"+this.name);
        System.out.println("Plant"+this.plantDate);
        System.out.println("Fertility"+this.fertility);
        System.out.println("Humidity"+this.humidity);
        System.out.println("Growth"+this.growth);
        System.out.println("product"+this.product);
        System.out.println("****************************************************");
    }
}
