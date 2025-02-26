package com.text_25_2_26;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    private String filename;

    public File() {
        this.filename = "./mydata.txt";
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
    FileWriter fw;

    {
        try {
            fw = new FileWriter(this.filename);
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
}
