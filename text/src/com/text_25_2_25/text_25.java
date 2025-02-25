package com.text_25_2_25;

import java.util.ArrayList;
import java.util.Scanner;

public class text_25 {
    public static void main(String[] args) {
     /* ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("请你输入一个数:");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if(num<1||num>100){
                System.out.println("你输入的数不符合规则!");
                continue;
            }
            list.add(num);
            sum+=num;
            if(sum>200){
                System.out.println("结束!");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(sum);
    }*/
        Scanner sc = new Scanner(System.in);
//        while(true) {
//            System.out.println("请你输入数字:");
//            String numStr = sc.nextLine();
//            int num ;
//            if(compare(numStr)){
//                num = Integer.parseInt(numStr);
//                System.out.println(num);
//                break;
//            }else{
//                System.out.println("重新输入!");
//            }
//        }
        int num = sc.nextInt();
        String str = toBinaryStr(num);
        System.out.println(str);
    }

    private static String toBinaryStr(int num) {
        String str = "";;
        while (num!=0) {
            int d = num % 2;
            num /= 2;
            str = d + str;
        }
        return str;

    }

    private static boolean compare(String numStr) {
        String regex = "[1-9]\\d{0,9}";
        return numStr.matches(regex);
    }
    }
