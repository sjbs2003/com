package com.BitWise;

public class FindUnique {
    public static void main(String[] args) {
        int [] arr ={1,1,2,2,3,3,6,6,5,5,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique=0;

        for (int n :arr){
            unique^=n;
        }
        return unique;
    }
}
