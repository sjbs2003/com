package com.LeetCode.Binary_Search;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class leetCode33 {

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if u don't find a pivot that means, array is rotated
        if (pivot == -1){
            // just do normal Binary Search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // if pivot is found u have found 2 asc arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0,pivot-1);
        }
        return binarySearch(nums,target, pivot+1, nums.length-1);
    }


    int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // For the 4 cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end= mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }


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
