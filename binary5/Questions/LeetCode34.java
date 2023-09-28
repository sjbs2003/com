package com.binary5.Questions;

import java.util.Arrays;

//  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,6,7,7,8,9,32,34,44,54,67,78,98};
        int target = 7;
        System.out.println(Arrays.toString(SearchRange(nums, target)));
    }

    public static int[] SearchRange(int[] nums, int target){

        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);

        return ans;
    }

    static int search(int[] nums, int target, boolean FindStartIndex){
        int ans = -1;
        int start =0;
        int end = nums.length - 1;

        while (start <= end ){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;
            }
            else {
                //potential ans found
               ans = mid;
               if (FindStartIndex){
                   end = mid-1 ;
               }else{
                   start = mid+1;
               }
            }
        }
        return ans;
    }
}
