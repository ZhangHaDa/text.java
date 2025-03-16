package com.study_25_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text_7_1 {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("text\\a.txt");
//        FileOutputStream fos = new FileOutputStream("text\\aa.txt");
//        int b;
//        while((b = fis.read())!= -1){
//            fos.write(b^2);
//        }
//
//        fos.close();
//        fis.close();
        Game_5 game = new Game_5();
        game.run();
        File file = new File("text\\a.txt");
    }

}
