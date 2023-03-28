package com.Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(302010608));
    }
    static int count(long n) {
        return helper(n,0);
    }
    static int helper(long n, int c){
        if (n==0){
            return c;
        }
        long rem=n%10;
        if (rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
