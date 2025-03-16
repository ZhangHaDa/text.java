package com.study_io_3;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Text_9_2 {
    public static void main(String[] args) throws IOException {
        File scr = new File("D:\\aaaa.zip");
        File dest = new File("D:\\");
        getZip(scr,dest);
    }
    public static void getZip(File scr,File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(scr));
        ZipEntry entry;
        while((entry = zis.getNextEntry())!=null){
            System.out.println(entry);
            if(entry.isDirectory()){
                File file = new File(dest,entry.getName());
                file.mkdirs();
            }else{
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.getName()));
                int b;
                while((b = zis.read())!=-1){
                    fos.write(b);
                }
                fos.close();
            }
            zis.closeEntry();
        }
        zis.close();

    }
}
