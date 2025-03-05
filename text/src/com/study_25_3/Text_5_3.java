package com.study_25_3;

import java.io.File;

public class Text_5_3 {
    public static void main(String[] args) {
        File fil1 = new File("D:\\abcd");
        d(fil1);
    }
    public static  void d(File fil1){
        File[] files = fil1.listFiles();
        for (File f : files) {
            if(f.isFile()){
                f.delete();
            }else{
                d(f);
            }
        }
        fil1.delete();
    }
}
