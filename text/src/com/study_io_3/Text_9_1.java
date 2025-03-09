package com.study_io_3;

import java.io.*;
import java.nio.charset.Charset;

public class Text_9_1 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream("text\\aa.txt",true),true, Charset.forName("UTF-8"));

        ps.println(12);
        ps.print("你好");
        ps.printf("%d",45);
        ps.close();

        PrintWriter pw = new PrintWriter(new FileWriter("text\\aaa.txt"),true);
        pw.println(123);
        pw.print("你好");
        pw.printf("%s","年后哦哦哦好");
        pw.close();

    }
}
