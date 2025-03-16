package text_12;

import java.util.Scanner;

public class text_12_15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        b(str);
        System.out.println(str);
    }

    private static void b(String str) {

    }
}
