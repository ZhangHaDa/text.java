package com.study_25_3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Text_5_4 {
    public static void main(String[] args) {
        File fil1 = new File("D:\\aaaaa");

    }
    public static HashMap<String,Integer>  getCount( File fil1){
        File[] scr = fil1.listFiles();
        HashMap<String,Integer> hm = new HashMap<>();


        for (File file : scr) {
            if(file.isFile()){
                String name = file.getName();
                String[] arr = name.split("\\.");
                if(arr.length>=2){
                    if(hm.containsKey(arr[arr.length-1])){
                        int count = hm.get(arr[arr.length - 1]);
                        count++;
                        hm.put(arr[arr.length-1],count);
                    }else{
                        hm.put(arr[arr.length-1],1);
                    }
                }
            }else{
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();

                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if(hm.containsKey(key)){
                       value+=hm.get(key);
                       hm.put(key,value);
                    }else{
                        hm.put(key,value);
                    }
                }

            }
        }
        return hm;
    }
}
