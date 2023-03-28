package com.array3;

import java.util.Arrays;

public class HowToInsertValueManually {
    public static void main(String[] args) {
        // how to add values by creating space in array
        int[] arr= new int[2];
        int val1=1;
        int val2=2;
        arr[arr.length-2]= val1;
        arr[arr.length-1]= val2;
        System.out.println(Arrays.toString(arr));
    }
}
