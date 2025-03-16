package com.study.reflect_25_3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Text_12_3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.study.reflect_25_3.Student_12");

        Method eat = aClass.getDeclaredMethod("eat", String.class);
        Parameter[] parameters = eat.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        Student_12 s = new Student_12();
        eat.setAccessible(true);

        Object o = eat.invoke(s, "汉堡包");
        System.out.println(o.toString());
    }
}
