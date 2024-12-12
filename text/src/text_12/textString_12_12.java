package text_12;
/*
import java.util.Scanner;
import java.util.StringJoiner;
public class textString_12_12 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("请你输入一个字符串：");
        String str = sc.next();//121
       StringBuilder sb = new StringBuilder();
       sb.append(str);
       //反转
       sb.reverse();
       String sbb = sb.toString();
        if(str.equals(sbb)){
            System.out.println("1");
        }
        int[] arr = {1,2,3};//[1,2,3]
        String sbbb = arrToString(arr);
        System.out.println(sbbb);
        String s = arrToStringNew(arr);
        System.out.println(s);

    }
        public static String arrToString(int[] arr){
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
                if(i==arr.length-1){
                    sb.append(arr[i]);
                }else{
                    //sb.append(arr[i]+",");
                    sb.append(arr[i]).append(",");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        public static String arrToStringNew(int[] arr){
            StringJoiner sj = new StringJoiner(",","[","]");
            for (int i = 0; i < arr.length; i++) {
                sj.add(arr[i]+"");
            }
            return sj.toString();
        }
}*/

import java.util.Scanner;

public class textString_12_12 {
    public static void main(String[] args) {
        //输入字符串
        String str = "";
        Scanner sc = new Scanner(System.in);
        while (true) {
            str = sc.next();
            //长度少于等于9，只有数字
            boolean flag = luoMa(str);
            if (flag) {
                String[] arr = {"零","一","二","三","四","五"};
                for (int i = 0; i < str.length(); i++) {
                     str = str.replace("i-48",arr[i]);
                }
                System.out.println(str);
                break;
            } else {
                System.out.println("输入错误");
            }
        }
    }

    public static boolean luoMa(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

























