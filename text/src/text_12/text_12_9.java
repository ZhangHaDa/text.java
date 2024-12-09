package text_12;
import java.util.Scanner;
public class text_12_9 {
    public static void main(String[]args){
        object o = new object();
        //o.age = 18;
        //o.name = "nna";
        o.eat();
        o.setAge(19);
        System.out.println(o.getAge());
        //System.out.println(o.age);
        //System.out.println(o.name);
        int[][] arr = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                System.out.println(arr[i][j]);
            }
        }
    }
}
