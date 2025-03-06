package com.study_25_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text_6_0 {
    public static void main(String[] args) throws IOException {
       // FileOutputStream fos = new FileOutputStream("text\\a.txt",true);
        FileInputStream fis =new FileInputStream("text\\a.txt");
        FileOutputStream fos = new FileOutputStream("text\\aa.txt");
        byte[] bytes = new byte[2];
        int len;
        while((len = fis.read(bytes))>-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

    }
}
