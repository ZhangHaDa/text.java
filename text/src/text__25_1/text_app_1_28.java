package text__25_1;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class text_app_1_28 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        //菜单
        menu2();
        int chose = sc.nextInt();
        switch (chose){
            case 1:
                //登录
                break;
            case 2:
                //注册
                break;
            case 3:
                //忘记密码
                break;
        }

    }
    //菜单
    public static void menu2(){
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请你选择操作:");
        System.out.println("1: 登录");
        System.out.println("2: 注册");
        System.out.println("3: 忘记密码");
    }
}
