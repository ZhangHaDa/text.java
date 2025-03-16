package text__25_1;

import java.util.Scanner;
import java.util.Random;

public class text_1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println(num);
    }
}
