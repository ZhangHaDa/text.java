package com.study_25_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class text_3_2 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
//        Integer[] arr = list.stream().filter(integer -> integer % 2 == 0).toArray(s -> new Integer[s]);
//        for (Integer i : arr) {
//            System.out.println(i);
//        }


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhansan,23","lisi,24","wangwu,25");


//        Map<String, Integer> map = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
//        System.out.println(map);

//
//        list.stream()
//                .filter(s->Integer.parseInt(s.split(",")[1])>=24)
//                .map(s->new Actor_3(s.split(",")[0],Integer.parseInt(s.split(",")[1])))
//                .forEach(s-> System.out.println(s));

   /*     list.stream().map(new Function<String, Actor_3>() {
            @Override
            public Actor_3 apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor_3(name,age);

            }
        }).forEach(s-> System.out.println(s));
*/
        //list.stream().map(text_3_2::newActor).forEach(actor3 -> System.out.println(actor3));

        list.stream().map(Actor_3::new).forEach(s-> System.out.println(s));
    }
    public static Actor_3 newActor(String s){
        return new Actor_3(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
    }
}
