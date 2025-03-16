package com.study_25_3;

import java.util.Scanner;

public class Text_4_1 {
    public static void main(String[] args) {
        Student_4 s = new Student_4();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请你输入姓名:");
                String name = sc.nextLine();
                s.setName(name);
                System.out.println("请你输入年龄:");
                String ageStr = sc.nextLine();
                s.setAge(Integer.parseInt(ageStr));
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式错误!");
            }catch(RuntimeException e){
                System.out.println("年龄或姓名错误!");
            }
        }
        System.out.println(s);

    }
}
