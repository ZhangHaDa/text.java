package com.study_25_3;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class text_1 {
    public static void main(String[] args) {
        /*Map<String,String> m = new HashMap<>();
        m.put("zhangSan","liSi");
        m.put("王五","李四");
        Set<String> set = m.keySet();
        Iterator<String> it = set.iterator();
        ArrayList<String> list = new ArrayList<>();
        list.add("ass");
        list.add("assdd");
        ListIterator<String> itt = list.listIterator();
        while(itt.hasNext()){
            String str = itt.next();
            System.out.println(str);
            if(str.equals("assdd")){
                itt.add("zxc");
            }
        }
        System.out.println(list);
        while(it.hasNext()){
            String str  = it.next();
            System.out.println(str);
        }*/
       /* for (String s : set) {
            System.out.println(s);
        }*/
       // set.forEach((String s)->System.out.println(s));
//        Map<String, String> map = new HashMap<>();
//        map.put("zhangSan","liSi");
//        map.put("wangWu","liSid");
//        Set<Map.Entry<String, String>> m = map.entrySet();
        /*for (Map.Entry<String, String> entry : m) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/
       /* Iterator<Map.Entry<String, String>> it = m.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> n = it.next();
            System.out.println(n.getKey());
            System.out.println(n.getValue());
        }*/
//        m.forEach(s-> System.out.println(s.getKey()+" "+s.getValue()));
//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String s, String s2) {
//                System.out.println(s+" "+s2);
//            }
//        });
        HashMap<Student_1, String> map = new HashMap<>();
        Student_1 s1 = new Student_1("zhangSan", 23);
        Student_1 s2 = new Student_1("zhangSan", 23);
        Student_1 s3 = new Student_1("liSi", 24);
        map.put(s1,"北京");
        map.put(s2,"天津");
        map.put(s3,"株洲");
        Set<Student_1> set = map.keySet();
       /* for (Student_1 s : set) {
            String ss = map.get(s);
            System.out.println(s+" "+ss);
        }*/

        /*Iterator<Student_1> it = set.iterator();
        while(it.hasNext()){
            Student_1 next = it.next();
            String s = map.get(next);
            System.out.println(next+" "+s);
        }*/

        /*set.forEach(new Consumer<Student_1>() {
            @Override
            public void accept(Student_1 s) {
                System.out.println(s+" "+map.get(s));
            }
        });*/

        Set<Map.Entry<Student_1, String>> entries = map.entrySet();
       /* for (Map.Entry<Student_1, String> e : entries) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }*/
       /* Iterator<Map.Entry<Student_1, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<Student_1, String> next = it.next();
            System.out.println(next.getKey()+" "+next.getValue());
        }*/

       /* entries.forEach(new Consumer<Map.Entry<Student_1, String>>() {
            @Override
            public void accept(Map.Entry<Student_1, String> s) {
                System.out.println(s.getKey());
                System.out.println(s.getValue());
            }
        });*/
    }
}
