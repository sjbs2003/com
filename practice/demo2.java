package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array= {9,8,7,6,5,4,3,2,1,0};
        int num=0;
        for (int i = 0; i < array.length; i++) {
            num=num*10 +array[i];
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