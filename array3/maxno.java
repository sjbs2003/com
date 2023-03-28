package com.array3;
public class maxno {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,18};
        System.out.println(maxRange(arr,0,3));
    }
    //work on edge cases here, like array being null
    static int maxRange(int[]arr, int start, int end){
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxVal =arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
