package com.LeetCode.Binary_Search;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,16,20,23,33};
        int target = 20;

        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        // first find the range
        // first starting with a box of suize 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range

        while(target > arr[end]){
            int newStart = end +1;
            // double the box value
            // end = previous end + (size of box)*2

            end = end +(end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr , int target, int start, int end ){
        while (start <= end ){
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
