package com.Recursion;

public class SortedOrNot {

    static boolean sorted(int[]arr,int index){
        if (index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }

    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println(sorted(arr,0));
    }
}
