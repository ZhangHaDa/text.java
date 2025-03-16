package com.study_io_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Text_9_5 {
    public static void main(String[] args) throws IOException {
        Properties prop  = new Properties();
//        prop.put("aaa","bbb");
//        prop.put("aaa","bbb");
//        prop.put("aaa","bbb");
//
//        prop.store(new FileOutputStream("text\\a.txt"),"text");
        FileInputStream fis = new FileInputStream("text\\a.txt");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

    }
}
