package com.BitWise;

public class OddEven {
    public static void main(String[] args) {
        int n= 6;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n & 1)==1; // if this condition satisfies the no, is odd else even
        // true -> odd
        //false -> even
    }
}
