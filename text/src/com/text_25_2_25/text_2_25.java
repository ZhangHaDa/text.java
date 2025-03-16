package com.text_25_2_25;

public class text_2_25 {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        int i = 0;
        int j = arr.length-1;
        toArr(arr,i,j);
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]+" ");
        }
    }

    private static void toArr(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        if(start>end)
            return;
        int num = arr[i];
        while(start!=end){
            while(true){
                if(start>=end||num>arr[end]){
                    break;
                }
                end--;
            }
            while(true){
                if(start>=end||num<arr[start]){
                    break;
                }
                start++;
            }
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
        }
        int t = arr[start];
        arr[start] = arr[i];
        arr[i] = t;
        toArr(arr,i,start-1);
        toArr(arr,start+1,j);
    }
}
