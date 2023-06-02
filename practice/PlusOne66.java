package com.practice;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        int[] arr= {9,8,7,6,5,4,3,2,1,0};
        addOneToLastElement(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void addOneToLastElement(int[] arr) {
        if (arr.length > 0) {
            arr[arr.length - 1]++;
        }
    }

}
