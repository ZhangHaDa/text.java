package text_12;

import java.util.Scanner;

public class text_12_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ret = "";
        while (true) {
            System.out.println("请你输入一个金额：");
            int money = sc.nextInt();//2135
            if(money>=0&&money<=9999999){
                while (true) {
                    int ge = money%10;
                    String newMoney = getBigNumber(ge);
                    ret = newMoney + ret;
                    money = money/10;
                    if(money==0)
                    {
                        break;
                    }
                }
                break;
            }else{
                System.out.println("输入错误！");
            }
        }
        int count = 7 - ret.length();
        for (int i = 0; i < count; i++) {
            ret = "零" + ret;
        }
        ret = getNewRet(ret);
        System.out.println(ret);
    }
    public static String getBigNumber(int number){
        String[] arr = {"零","壹","贰","弎","泗","伍"};
        return arr[number];
    }
    public static String getNewRet(String ret){
        String[] arr = {"一","一","一","一","一","一","一"};
        String newRet = "";
        for (int i = 0; i < ret.length(); i++) {

            newRet =  newRet + ret.charAt(i)   +arr[i];
        }
        return newRet;
    }
}
