package com.study_25_3;

import java.util.ArrayList;
import java.util.HashMap;

public class text_2_0 {
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        Collections.addAll(list1, "张三", "李四", "王五", "小李");
//        Random r = new Random();
//        for (int i = 0; i < 2; i++) {
//            int count = list1.size();
//            for (int j = 0; j < count; j++) {
//                int index = r.nextInt(list1.size());
//                String name = list1.remove(index);
//                System.out.println(name);
//                list2.add(name);
//            }
//           list1.addAll(list2);
//            list2.clear();

//        }
        HashMap<String,ArrayList<String>> hm = new HashMap<>();


        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("北京");
        list1.add("南京");
        list1.add("天津");

        list2.add("株洲");
        list2.add("长沙");
        list2.add("醴陵");

        hm.put("江苏",list1);
        hm.put("湖南",list2);

        hm.forEach((String s, ArrayList<String> strings)->System.out.println(s+" "+strings));

    }
}
