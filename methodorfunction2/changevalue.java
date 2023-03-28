package com.methodorfunction2;

import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        //creating an array
        int[] arr ={0,1,2,36,5,4,9,7};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void change(int[] arr) {
        arr[2]=145;
        //if u make change to the obj via this ref variable, same obj will b changed
    }
}
