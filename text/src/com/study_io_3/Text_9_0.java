package com.study_io_3;

import com.study_25_3.Student_3;

import java.io.*;

public class Text_9_0 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text\\a.txt"));
        Student_9 s = new Student_9("zhangSan", 23);
        oos.writeObject(s);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("text\\a.txt"));
        Student_9 o = (Student_9) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
