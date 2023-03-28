package com.array3;

import java.util.Arrays;

public class passinginfunctions {
    public static void main(String[] args) {
        int[] nums ={3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;

        // here we make an array and put values in it and then make a function
        // change which helped us to change the zeroth index of array
    }
}
