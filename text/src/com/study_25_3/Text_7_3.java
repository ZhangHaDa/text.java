package com.study_25_3;

import java.io.*;

public class Text_7_3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text\\aa.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text\\aaa.txt"));

        int d;
        while((d = bis.read())!=-1){
            bos.write(d);
        }
        bos.close();
        bis.close();
    }
}
