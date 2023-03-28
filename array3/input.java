package com.array3;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0]=1;
//        arr[1]=123;
//        arr[2]=145;
//        arr[3]=167;
//        arr[4]=189;
//        System.out.println(arr[0]);


        // input using for loops
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        //for (int j : arr) {
            //System.out.print(j + " ");
            //enhanced for loop

//        for(int num : arr) {// for every element in array,print the element
//            System.out.print(num + " ");// here num represents element of the array
//            }
//        System.out.println(arr[5]);// index out of bound error

        // Array for string
//        String [] str = new String[4];
//        for (int i=0 ; i < str.length; i++){
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));
//
//        // Modify
//        str[1]= "Shri";
//
//        System.out.println(Arrays.toString(str));

    }
}

