package com.text_25_2_26;

import java.io.*;
import java.util.ArrayList;

public class File {
    private String filename = "./myData.txt";

    public File() {
        this.filename = "./myData.txt";
    }

    public File(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }


    public void write(){}
    String[] fruits = {"apple","banana","pear","orange"};

    {
        try {
            FileWriter  fw = new FileWriter(this.filename);
            BufferedWriter bw  = new BufferedWriter(fw);
            for(String elem : fruits){
                bw.write(elem);
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Save file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void read(){
        ArrayList<String> list = new ArrayList<>();
        String line;

        try {
            FileReader fr = new FileReader(this.filename);
            BufferedReader br = new BufferedReader(fr);
            while((line=br.readLine())!=null){
                list.add(line);
            }
            br.close();
            fr.close();
            for (String s : list) {
                System.out.print(s+"\t");
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
