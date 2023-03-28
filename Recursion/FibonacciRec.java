package com.Recursion;

public class FibonacciRec {
    public static void main(String[] args) {
//        System.out.println(fibo(45));// can't exceed 45
//        // can be solved only by dynamic programming
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n) {
        return (int) ((int) (Math.pow(((1 + Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

//    static int fibo(int n){
//        //base condition
//        if (n<2){
//            return n; // if n=0 or 1 it will return 0 & 1
//        }
//        return fibo(n-1) + fibo(n-2);
//    }


}
