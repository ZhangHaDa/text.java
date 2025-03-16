package com.text_25_2_24;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class text_24 {
    public static void main(String[] args) {
        String regex1 = "1[3-9]\\d{9}";
        String regex2 = "0\\d{2,3}-?\\d{5}";
        String regex3 = "[\\w&&[^_]]{1,}@[\\w&&[^_]]{2,}(\\.[a-zA-Z]{2,}{1,})";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher("1235544");
    }
}