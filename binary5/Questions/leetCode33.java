package com.binary5.Questions;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class leetCode33 {

//    public int search(int[] nums, int target) {
//
//    }

//    static int findPivot(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            // For the 4 cases
//            if(arr[mid] > arr[mid+1]){
//                return mid;
//            }
//            if(arr[mid] < arr[mid-1]){
//                return mid-1;
//            }
//
//        }
//    }


    static int binarySearch(int[] arr , int target, int start, int end){
        while (start <= end ){
            // find the middle term
            //    int mid = (start + end) / 2; // this form might create problem when it will succeed the int limit
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else {
                //answer found
                return mid;
            }
        }
        return -1;
    }
}
