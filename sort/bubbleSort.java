package com.sort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {-32,-89,89,7};
        //int[] arr = {1,2,3,4,5};  // 2nd case
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped; //Mainly for 2nd case but can be used in 1st one as well (array)
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;  //2nd case
            // for each step, max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //j have to be at 1st index bcoz 'i' is at 0th index
                // swap if  the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;  //2nd case
                }
            }
            // if u didn't swap for a particular value of i , it means the array is sorted hence stop the program
            if (!swapped){   // !false =true
                break;
            }
        }
    }
}


