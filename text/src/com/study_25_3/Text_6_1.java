package com.study_25_3;

import java.io.UnsupportedEncodingException;

public class Text_6_1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "你猜猜";
        byte[] bytes = str.getBytes("UTF-8");
        String str1 = new String(bytes,"UTF-8");
        System.out.println(str1);
    }
}
