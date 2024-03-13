package com.LeetCode.Binary_Search;

// https://leetcode.com/problems/split-array-largest-sum/
public class leetCode410 { // split array
    public static void main(String[] args) {

    }


    public int splitArray(int[] nums, int m) {
        int start=0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);// imn the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        // binary search
        while(start < end){
            // try for middle as the potential ans
            int mid = start + (end - start) / 2 ;

            // calculate how many pieces u can divide this in with this max sum
            int sum = 0;
            int pieces = 0;
            for(int num: nums){
                if (sum + num > mid){
                    // u cannot add this in this sub array, make new one
                    // say u add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }
            if (pieces > m){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return start; // here start == end
    }
}
