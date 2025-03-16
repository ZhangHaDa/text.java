package com.study_25_3;

import java.io.*;

public class Text_7_0 {
    public static void main(String[] args) {
        File scr = new File("text\\a.txt");
        File dext = new File("text\\aa.txt");


    }
    public static void copyFile(File scr,File dext) throws IOException {
        dext.mkdirs();
        File[] files = scr.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileOutputStream fos = new FileOutputStream(new File(dext,file.getName()));
                FileInputStream fis = new FileInputStream(file);
                int len;
                byte[] bytes = new byte[2];
                while ((len = fis.read(bytes))!=-1) {
                    fos.write(bytes,0,len);
                }
                fis.close();
                fos.close();
            }else{
                copyFile(file,new File(dext,file.getName()));
            }
        }

    }

}
