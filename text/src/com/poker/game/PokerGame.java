package com.poker.game;

import java.util.*;

public class PokerGame {

    static ArrayList<String> listAll = new ArrayList<>();
    static HashMap<String,Integer> hm = new HashMap<>();
    static{
        //有一堆牌

        //定义其中变量
        String[] colour = {"♠","♥","♦","♣"};
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //循环得到对应牌数
//        for (int i = 0; i < colour.length; i++) {
//            for (int j = 0; j < num.length; j++) {
//                String s = colour[i]+num[j];
//                listAll.add(s);
//            }
//        }
        for (String c : colour) {
            for (String n : num) {
                listAll.add(c+n);
            }
        }
        //再次添加
        listAll.add(" 小王");
        listAll.add(" 大王");


        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",100);
        hm.put("大王",150);
        System.out.println(listAll);
    }


    public PokerGame(){

        //定义玩家的牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        //定义底牌
        ArrayList<String> hand = new ArrayList<>();

        //洗牌
        Collections.shuffle(listAll);

        //分牌
        for (int i = 0; i < listAll.size(); i++) {
            String poker = listAll.get(i);
            if(i<3){
                hand.add(poker);
                continue;
            }
            if(i%3==0){
                player1.add(poker);
            }else if(i%3==1){
                player2.add(poker);
            }else{
                player3.add(poker);
            }
        }

        //排序
        compareNum(player1);
        compareNum(player2);
        compareNum(player3);
        compareNum(hand);



        //看牌
        lookPoker("底牌",hand);
        lookPoker("张三",player1);
        lookPoker("李四",player2);
        lookPoker("王五",player3);



    }
    //排序
    public void compareNum( ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String colour1 = o1.substring(0, 1);
                String colour2 = o2.substring(0, 1);
                int i = getNum(o1) - getNum(o2);
                return i==0?colour1.compareTo(colour2):i;


            }
        });
    }
    //计算大小
    public int getNum(String s) {
        String str = s.substring(1);
        if (hm.containsKey(str)) {
            return hm.get(str);
        }
        return (int) Integer.parseInt(str);
    }
    //看牌
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+": ");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }

//定义总牌
//static HashMap<Integer, String> hm = new HashMap<>();
//static ArrayList<Integer> list = new ArrayList<>();
//    //有一堆牌
//    static {
//        //定义其中变量
//        String[] colour = {"♠", "♥", "♦", "♣"};
//        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//
//        //定义序号
//        int serialNumber = 1;
//
//        //循环添加对应序号和牌
//        for (String n : number) {
//            for (String c : colour) {
//                hm.put(serialNumber,c+n);
//                list.add(serialNumber);//填充List,方便对list随机得到序号
//                serialNumber++;
//            }
//        }
//        hm.put(serialNumber,"小王");
//        list.add(serialNumber);
//        serialNumber++;
//        hm.put(serialNumber,"大王");
//        list.add(serialNumber);
//
//        System.out.println(hm);
//        System.out.println(list);
//    }
//
//
//    public PokerGame(){
//        //定义分牌变量(存序号)
//        TreeSet<Integer> hand = new TreeSet<>();
//        TreeSet<Integer> player1 = new TreeSet<>();
//        TreeSet<Integer> player2 = new TreeSet<>();
//        TreeSet<Integer> player3 = new TreeSet<>();
//
//        //循环随机分配
//        Collections.shuffle(list);
//        for (int i = 0; i < list.size(); i++) {
//            int serialNumber = list.get(i);
//            if(i<3){
//                hand.add(serialNumber);
//                continue;
//            }
//            if(i%3==0){
//                player1.add(serialNumber);
//            }else if(i%3==1){
//                player2.add(serialNumber);
//            }else{
//                player3.add(serialNumber);
//            }
//        }
//        Poker("小李",hand);
//        Poker("小强",player1);
//        Poker("张三",player2);
//        Poker("李四",player3);
//
//    }
//    public void Poker(String name,TreeSet<Integer> ts){
//        System.out.print(name+": ");
//        for (Integer num : ts) {
//            System.out.print(hm.get(num)+" ");
//        }
//        System.out.println();
//    }
}
