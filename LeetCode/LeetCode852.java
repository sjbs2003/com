package com.LeetCode;

public class LeetCode852 {
    // same ans for Q 162
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in the dec part of the array
                // this may be the ans, but take a look at left part
                // this is why end != mid-1
                end = mid;
            } else{
                // you are in the asc part of the array
                // because we know that mid+1 element > mid-element
                start = mid+1;
            }
        }
        return start; // or end because they are equal
    }
}
