package com.study_25_3;


import java.io.File;

public class Text_5_2 {
    public static void main(String[] args) {
        File fil1 = new File("C:\\");
        //System.out.println(findAVI(fil1));
        findAVI(fil1);
    }
    public static void findAVI(File fil1){
        File[] f = fil1.listFiles();

        if (f!=null) {
            for (File file : f) {
                    if(file.isFile()&&file.getName().endsWith(".avi")){
                        System.out.println(file);
                       // return;

                    } else {
                        findAVI(file);
                    }
            }
        }
        // return;
    }
}
