package com.study_25_3;

import java.io.File;

public class Text_5_0 {
    public static void main(String[] args) {
        File fi1 = new File("D:\\code1_java\\bbb\\aaa.txt");
        File fi2 = new File("D:\\code1_java\\bbb");
        //System.out.println(fi2);

        System.out.println(fi1.isDirectory());
        System.out.println(fi1.isFile());
        System.out.println(fi1.exists());
        System.out.println(fi1.length());
        System.out.println(fi1.getAbsoluteFile());
        System.out.println(fi1.getPath());
        System.out.println(fi1.getName());
        System.out.println(fi1.lastModified());
        System.out.println(fi1.delete());
        System.out.println(fi2.delete());
    }
}
