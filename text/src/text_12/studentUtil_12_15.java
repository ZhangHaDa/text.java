package text_12;

import java.util.ArrayList;

public class studentUtil_12_15 {
    private studentUtil_12_15(){}
    public static int getMaxStudent(ArrayList<obStaticStudent_12_15> list){
        int max = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if(tempAge>max){
                max = tempAge;
            }
        }
        return max;
    }
}
