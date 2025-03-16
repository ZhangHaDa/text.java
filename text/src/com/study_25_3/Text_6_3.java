package com.study_25_3;

import java.io.FileWriter;
import java.io.IOException;

public class Text_6_3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("text\\aa.txt");
        //fw.write(11222);
        char[] ch = {'a','c','你'};
        fw.write(ch);

        fw.close();
    }
}
