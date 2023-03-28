package com.binary5;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-2,0,3,8,10,12,16,24,28,32,48,60};
        int target= 24;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
        System.out.println(binarySearch(arr,target));
    }
    //return the index
    // return -1 if it doesn't exist
    static int binarySearch(int[] arr , int target){
        int start =0;
        int end = arr.length - 1;

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
