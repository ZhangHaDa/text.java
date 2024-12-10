package text_12;
import java.util.Scanner;
public class textCar_12_10 {
    public static void main(String[]args){
        objectCar_12_10[] arr = new objectCar_12_10[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            objectCar_12_10 c = new objectCar_12_10();
            c.setId(sc.next());
            c.setName(sc.next());
            c.setPrice(sc.nextInt());
            c.setCount(sc.nextInt());
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("id:%s 名字:%s 价格：%d 数量：%d",arr[i].getId(),arr[i].getName(),arr[i].getPrice(),arr[i].getCount());
        }
    }
}
