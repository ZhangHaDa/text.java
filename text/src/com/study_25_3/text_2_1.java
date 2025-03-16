package com.study_25_3;

import java.util.*;

public class text_2_1 {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3);
        System.out.println(sum);

        List<Integer> num = List.of(1, 2, 3, 4);
        Set<Integer> integers = Set.of(1, 2, 3);
        HashMap<String,String> hm = new HashMap<>();
        hm.put("zhangSan","lisi");
        hm.put("wangWu","lisi");
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
        Map map = Map.ofEntries(arr);
        System.out.println(map);

    }
    public static int sum(int... n){
        int sum = 0;
        for (int i : n) {
            sum+=i;
        }
        return sum;
    }
}
