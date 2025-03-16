package com.study.reflect_25_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Text_12_1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.study.reflect_25_3.Student_12");

//        Constructor<?>[] c1 = clazz.getConstructors();
//        for (Constructor<?> constructor : c1) {
//            System.out.println(constructor);
//        }
//        Constructor<?>[] c2 = clazz.getDeclaredConstructors();
//        for (Constructor<?> constructor : c2) {
//            System.out.println(constructor);
//        }
        Constructor<?> c3 = clazz.getConstructor();
        int i = c3.getModifiers();
        System.out.println(i);
        c3.setAccessible(true);
        Student_12 s = (Student_12) c3.newInstance();
        System.out.println(s);

        Constructor<?> ss = clazz.getDeclaredConstructor(String.class);
        System.out.println(ss);
    }
}
