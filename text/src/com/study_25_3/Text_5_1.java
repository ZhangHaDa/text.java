package com.study_25_3;

import java.io.File;
import java.io.IOException;

public class Text_5_1 {
    public static void main(String[] args) throws IOException {
        File fil1 = new File("D:\\code1_java\\aaa");
        System.out.println(fil1.mkdirs());
        // System.out.println(fil1.createNewFile());
        System.out.println(findAVI(fil1));

    }
    public static boolean findAVI(File fil1){

        if (fil1.isDirectory()) {
            File[] f = fil1.listFiles();

            for (File fil : f) {
                if(fil.isFile()&&fil.getName().endsWith("avi"))
                    return true;
            }
        }
        return false;
    }
}
