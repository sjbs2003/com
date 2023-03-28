package com.linear4;

public class main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,55,6,19,77,8,35,36,54,42};
        int target = 55;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    //return the target and return true or false

    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        //run for a loop
        for (int element : arr) { //enhanced for loop
            // check for element at every index if it is=target
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }
    //return the target and element
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //run for a loop
        for (int element : arr) { //enhanced for loop
            // check for element at every index if it is=target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
        //-1 might be a value in array
    }

    // search in the array:return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run for a loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is=target
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }
}
