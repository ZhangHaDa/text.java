package com.study.reflect_25_3;

import java.lang.reflect.Field;

public class Text_12_2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.study.reflect_25_3.Student_12");

//        Field[] fields = aClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        Field name = aClass.getDeclaredField("name");
        System.out.println(name.getName());
        Student_12 s = new Student_12("zhangSan");
        name.setAccessible(true);
        Object o = name.get(s);
        System.out.println(o.toString());
        name.setAccessible(true);
        name.set(s,"lisi");
        System.out.println(s);
    }
}
