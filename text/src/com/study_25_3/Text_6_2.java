package com.study_25_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Text_6_2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text\\a.txt");
        int ch;
        char[] chars = new char[2];
        while((ch=fr.read(chars)) !=-1){
            System.out.print(new String(chars));
        }
        fr.close();
    }
}
