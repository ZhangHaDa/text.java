package com.juc_25_3;

import java.util.Random;

public class ThreadRed_10 extends Thread{
    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized(ThreadRed_10.class){
            if(count==0){
                System.out.println(getName()+"没有抢到红包");
            }else{
                double p = 0;
                Random r = new Random();
                if(count==1){
                    p = money;
                    ///System.out.println(getName()+"抢到了"+p);
                }else{
                    double v = money - (count - 1) * MIN;
                    p = r.nextDouble(v)+0.01;
//                    if(p<MIN){
//                        p = MIN;
//                    }
                }
                money = money - p;
                count--;
                System.out.println(getName()+"抢到了"+p);

            }



        }
    }
}
