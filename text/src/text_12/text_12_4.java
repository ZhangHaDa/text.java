package text_12;

import java.util.Random;
import java.util.Scanner;

public class text_12_4 {
    public static void main(String[]args){
        /*System.out.println("hello world");
        int num = 10;
        int  a = 10;
        System.out.println(num+a);
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(i+j);*/
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i<26){
                arr[i] = (char)('a'+i);
            }else{
                arr[i] = (char)('A'+i-26);
            }
            System.out.println(arr[i]);
        }
        String s = generateVerificationCode();
        System.out.println(s);

    }
    public static String generateVerificationCode(){
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i<26){
                arr[i] = (char)('a'+i);
            }else{
                arr[i] = (char)('A'+i-26);
            }
        }
        Random r = new Random();
        char[] newArr = new char[5];
        for (int i = 0; i < newArr.length; i++) {
            if(newArr.length-1==i){
                newArr[i] = (char)(r.nextInt(10)+48);
            }else{
                newArr[i] = arr[r.nextInt(52)];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            int d = r.nextInt(5);
            char c = newArr[i];
            newArr[i] = newArr[d];
            newArr[d] = c;
        }
        String s = new String(newArr);
        return s;
    }
}
