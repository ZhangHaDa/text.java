package text_12;

import java.util.ArrayList;

public class textStatic_12_15 {
    public static void main(String[] args){
        ArrayList<obStaticStudent_12_15> list = new ArrayList<>();
        obStaticStudent_12_15 o1 = new obStaticStudent_12_15("zhangsan",23,"nan");
        obStaticStudent_12_15 o2 = new obStaticStudent_12_15("lisi",24,"nan");
        obStaticStudent_12_15 o3 = new obStaticStudent_12_15("wangwu",25,"nv");
        list.add(o1);
        list.add(o2);
        list.add(o3);
        int maxStudent = studentUtil_12_15.getMaxStudent(list);
        System.out.println(maxStudent);
    }
}
