package com.study_25_3;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class text_3_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-男-23","张强-女-12","李四-女-13","张三丰-男-14","李世超-男-15");//,"张三-男-23","张三-男-23"
//        list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//
//
//        String[] arr = list.stream().toArray(value -> new String[value]);
//        for (String s : arr) {
//
//            System.out.println(s);
//        }

//        long d = list.stream().count();
//        System.out.println(d);
//
//        List<String> list1 = list.stream().collect(Collectors.toList());
//        System.out.println(list1);

//        List<String> list1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
//        System.out.println(list1);

//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                String[] split = s.split("-");
//                return "男".equals(split);
//            }
//        })

        HashSet<String> hs= new HashSet<>();
        Collections.addAll(hs,"张三-男-23","张强-女-12","李四-女-13","张三丰-男-14","李世超-男-15","张三-男-23","张三-男-23","张三-男-23");
//        for (String s : hs.stream().toArray(value -> new String[value])) {
//            System.out.println(s);
//        }
//
//        Set<String> set = hs.stream().collect(Collectors.toSet());
//        System.out.println(set);

//
//        List<String> list2 = hs.stream().collect(Collectors.toList());
//        System.out.println(list2);

//        Map<String, Integer> map = list.stream()
//                .filter(s -> "男".equals(s.split("-")[1]))
//                .collect(Collectors.toMap(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.split("-")[0];
//                    }
//                }, new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s.split("-")[2]);
//                    }
//                }));
//        System.out.println(map);


        Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map);
    }

}
