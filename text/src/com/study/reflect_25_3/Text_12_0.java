package com.study.reflect_25_3;

public class Text_12_0 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> a = Class.forName("com.study.reflect_25_3.Student_12");
        System.out.println(a);
        Class<Student_12> b = Student_12.class;
        System.out.println(b);

        Class<? extends Student_12> c = new Student_12().getClass();
        System.out.println(c);
    }
}
