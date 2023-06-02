package com.practice;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        int[] array= {9,8,7,6,5,4,3,2,1,0};
        int num=0;
        for (int j : array) {
            num = num * 10 + j;
        }
        num += 1;
        System.out.println(num);
        String numStr= String.valueOf(num);
        char[] numChar = numStr.toCharArray();
        int[] arr = new int[numChar.length];

        for (int i = 0; i < numChar.length; i++) {
            arr[i]=Character.getNumericValue(numChar[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}