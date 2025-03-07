package com.study_25_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Text_7_2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text\\aa.txt");
        int d;
        StringBuffer sb = new StringBuffer();
        while((d = fr.read())!= -1){
            sb.append((char) d);
        }
        fr.close();

        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        String replace = Arrays.toString(arr).replace(",", "-");
        String result = replace.substring(1, replace.length() - 1);
        System.out.println(result);
        FileWriter fw = new FileWriter("text\\aaa.txt");
        fw.write(result);
        fw.close();
    }
}
