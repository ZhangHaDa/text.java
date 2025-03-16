package text_12;
import java.util.Random;
public class text_12_6 {
        public static void main(String[]args){
            int[] num = new int[10];
            Random r = new Random();
            int sum = 0;
            for(int i =0;i<num.length;i++){
                int n = r.nextInt(100)+1;
                num[i] = n;
                sum+=num[i];
            }
            System.out.println("总和："+sum);
            double av = (double)sum/num.length;
            System.out.println("平均值："+av);
            for(int i =0;i<num.length;i++){
                if(num[i]<av)
                System.out.println("低于平均值的数："+num[i]);
            }
            int[] arr = {1,2,3,4,5,6};
            for (int i = 0; i < arr.length; i++) {
                int arrn = r.nextInt(6);
                int t = arr[i];
                arr[i] = arr[arrn];
                arr[arrn] = t;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"  ");
            }
    }


}
