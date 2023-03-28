package com.binary5;

public class CeilingOfANo {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target= 15;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }
    //return the index of the smallest no >= target

    static int ceiling(int[] arr , int target){

        //but what if the target is the greater than the greatest no of the array
        if(target > arr[arr.length - 1]){
            return -1;
        }
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
        return start;
    }
}
