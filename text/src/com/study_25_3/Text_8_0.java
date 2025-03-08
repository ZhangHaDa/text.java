package com.study_25_3;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Text_8_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("t"));
        TreeMap<Integer,String> tm = new TreeMap<>();
        String line;
        while((line=br.readLine())!=null){
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),line);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter(""));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();
    }
}
