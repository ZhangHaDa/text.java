package com.study.reflect_25_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Text_12_4 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student_12 s = new Student_12("lisi",24);
        saveFile(s);
    }

    private static void saveFile(Object obj) throws IllegalAccessException, IOException {
        Class<?> a = obj.getClass();
        Field[] declaredFields = a.getDeclaredFields();
        BufferedWriter bw = new BufferedWriter(new FileWriter("text\\a.txt"));
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            Object o = declaredField.get(obj);
            //System.out.println(name+"="+o);
            bw.write(name+"="+o);
            bw.newLine();
        }
        bw.close();
    }
}
