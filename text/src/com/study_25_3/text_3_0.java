package com.study_25_3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class text_3_0 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"A","z","a");
//        list.stream().forEach(s -> System.out.println(s));
//        HashMap<String,Integer> hm = new HashMap<>();
//        hm.put("zhangSan",23);
//        hm.put("lisi",24);
//        hm.put("wangWu",25);
//       // hm.keySet().stream().forEach(s -> System.out.println(s));
//        hm.entrySet().stream().forEach(s-> System.out.println(s));
//
//        int[] arr = {1,2,3,4,5};
//        Arrays.stream(arr).forEach(s-> System.out.println(s));
//        Stream.of(1,2,3,4).forEach(s-> System.out.println(s));
//        String[] arr1 = {"a","a","x"};
//        Stream.of(arr1).forEach(s -> System.out.println(s));
//        HashSet<String> hs = new HashSet<>();
//



        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-23","张强-12","李四-13","张三丰-14","李世超-15","张三-23","张三-23","张三-23");
        //list.stream().filter(s ->s.startsWith("张")).forEach(s-> System.out.println(s));
        // list.stream().limit(4).skip(2).filter(s->s.startsWith("张")).forEach(s -> System.out.println(s));
//        list.stream()
//                .distinct()
//                .forEach(s-> System.out.println(s));
//        ArrayList<String> list1 = new ArrayList<>();
//        Collections.addAll(list1,"小李","林冲");
//        Stream
//                .concat(list.stream(),list1.stream())
//                .distinct()
//                .forEach(s -> System.out.println(s));

//        list.stream().distinct().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");
//                return Integer.parseInt(arr[1]);
//            }
//        }).forEach(s-> System.out.println(s));



        list.stream()
                .distinct()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));

    }
}
