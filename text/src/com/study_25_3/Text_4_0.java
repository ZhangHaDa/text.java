package com.study_25_3;

public class Text_4_0 {
    public static void main(String[] args) {
//        Student_4[] s= new Student_4[3];
//        System.out.println(s[1].getName());

//        Student_4 s =new Student_4();
//        s.setAge(12);

        int[] arr = {};
//        try {
//            System.out.println(arr[10]);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try {
           int max = getMax(arr);
            System.out.println(max);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("长度为0");
        }catch (NullPointerException e){
            System.out.println("空指针");
        }
        System.out.println("00");

    }
    public static int getMax(int[] arr){
       if(arr==null)
           throw new NullPointerException();
       if(arr.length==0)
           throw new ArrayIndexOutOfBoundsException();
        int max = arr[0];
        for (int i : arr) {
            if(max<i)
                max = i;
        }
        return max;
    }

}
