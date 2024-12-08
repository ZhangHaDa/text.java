package text_12;

//import java.util.Random;
//import java.util.Scanner;
/// /public class text_12_8 {
/// /    public static void main(String[] args) {
/// /        char[] arr = new char[52];
/// /        Random r = new Random();
/// /        for (int i = 0; i < arr.length; i++) {
/// /            if (i < 26)
/// /                arr[i] = (char) ('a' + i);
/// /            else
/// /                arr[i] = (char) ('A' - 26 + i);
/// /        }
/// /        String s = "";
/// /        for (int i = 0; i < 4; i++) {
/// /            s = arr[r.nextInt(52)] + s;
/// /        }
/// /        s = s + r.nextInt(10);
/// /        System.out.println(s);
/// /
/// /    }
//
/// /}
//
//public class text_12_8 {
//    public static void main(String[] args) {
//        int[] newarr = gets();
//        int max = getmax(newarr);
//        int min = getmin(newarr);
//        int sum = getsum(newarr);
//        int av = (sum - max - min) / (newarr.length - 2);
//        System.out.println(av);
//    }
//
//
//    public static int[] gets() {
//        int[] arr = new int[6];
//        Scanner s = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.nextInt();
//        }
//        return arr;
//    }
//
//    public static int getmax(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    public static int getmin(int[] arr) {
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//
//    public static int getsum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum;
//    }
//}

//import java.util.Random;
//
//public class text_12_8 {
//    public static void main(String[] args) {
//        int[] arr = {2, 588, 888, 1000, 10000};
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            int randomIndox = r.nextInt(arr.length);
//            int tamp = arr[i];
//            arr[i] = arr[randomIndox];
//            arr[randomIndox] = tamp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "  ");
//        }
//        int[] num = {8, 7, 9, 6};
//        int sum = 0;
//        for (int i = 0; i < num.length; i++) {
//            sum = sum * 10 + num[i];
//        }
//        System.out.println(sum);
//    }
//}

import java.util.Scanner;
import java.util.Random;

public class text_12_8 {
    public static void main(String[] args) {
        //定义中奖号码
        int[] arr = getNumber();

        //用户输入号码
        int[] userArr = userNumber();

        //判断红球和篮球个数
        int redNumber = 0;
        int blueNumber = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < userArr.length-1; j++) {
                if (arr[i]==userArr[j]){
                    redNumber++;
                }
            }
        }
        if(arr[arr.length-1] == userArr[userArr.length-1]){
            blueNumber++;
        }

        //判断是否中将


    }


    //定义
    public static int[] getNumber() {
        int[] winNumber = new int[7];
        Random r = new Random();
        //红球
        for (int i = 0; i < winNumber.length - 1; ) {
            int randomNumber = r.nextInt(33) + 1;
            boolean flag = exist(winNumber, randomNumber);
            if (!flag) {
                winNumber[i] = randomNumber;
                i++;
            }

        }
        //篮球
        int randomNumber = r.nextInt(16) + 1;
        winNumber[winNumber.length - 1] = randomNumber;
        return winNumber;
    }

    //输入
    public static int[] userNumber() {
        Scanner sc = new Scanner(System.in);
        //输入红球
        int[] userNum = new int[7];
        for (int i = 0; i < userNum.length - 1; ) {
            System.out.println("请你输入第" + (i + 1) + "个红球号码：");
            int number = sc.nextInt();
            if (number >= 1 && number <= 33) {
                boolean flag = exist(userNum, number);
                if (!flag) {
                    userNum[i] = number;
                    i++;
                } else {
                    System.out.println("号码已存在，请你重新输入：");
                }
            } else {
                System.out.println("没有此号码！");
            }
        }
        //输入篮球
        while (true) {
            System.out.println("请你输入篮球号码：");
            int number = sc.nextInt();
            if (number >= 1 && number <= 16) {
                userNum[userNum.length - 1] = number;
                break;
            } else {
                System.out.println("号码不存在，请你重新输入：");
            }
        }

        return userNum;
    }

    //是否存在
    public static boolean exist(int[] winNumber, int randomNumber) {
        for (int i = 0; i < winNumber.length - 1; i++) {
            if (randomNumber == winNumber[i]) {
                return true;
            }
        }
        return false;
    }


}














