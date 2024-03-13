package com.LeetCode.Array;

// https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class Lc88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n-1; // pointer at the end of nums1
        int p1 = m-1;    // pointer at the last element of nums1
        int p2 = n-1;    // pointer at the last element of nums2

        while(p1>=0 && p2>=0){
            if (nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
                p--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }
        }
        while (p2>0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
