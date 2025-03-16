package com.study_25_2;
import java.util.Scanner;
public class text_2_21 {
    public static void main(String[] args) {
        int[] arr = new int[2];
    }

}

/*
class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        scannerNum(nums);
        int target = sc.nextInt();
        int [] arr = getNum(nums,target);
        get(arr);
    }
    public  static void  scannerNum(int[] nums) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
    }
    
    public static int [] getNum(int[] nums,int target){
        int [] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]!=nums[j]){
                    if(nums[i]+nums[j]==target){
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }

                }
            }
        }
        return arr;
    }
    public static void get(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(",");
        }
        System.out.print("]");
    }
    
}*/
