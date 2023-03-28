package com.Recursion;

public class ReverseNO {
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
        System.out.println(rev2(1234));
    }
    static int sum=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum =sum*10+rem;
        rev1(n/10);
    }

    static int rev2(int n){
        long digits = (long)(Math.log10(n)+1);
        return helper(n,digits);
    }
    static int helper(int n,long digits){
        if (n%10==n){
            return n;
        }
        int rem =n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
