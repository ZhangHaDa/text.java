package text_12;
import java.util.Scanner;
public class text_12_5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("个位是："+num%10);
        System.out.println("十位是："+num/10%10);
        System.out.println("百位是："+num/100);
        System.out.println("请你输入0到10的数:");
        int a = sc.nextInt();
        System.out.println("请你输入0到10的数:");
        int b =sc.nextInt();
        System.out.println(a>b);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean ret = x==6||y==6;
        boolean result = (x+y)%6==0;
        System.out.println(ret);
        System.out.println(result);


    }
}
