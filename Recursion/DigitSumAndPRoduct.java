package com.Recursion;

public class DigitSumAndPRoduct {
    public static void main(String[] args) {
        System.out.print("Sum: ");
        System.out.println(sum(1342));
//        System.out.println(sum(1982));
//        System.out.println(sum(1237223));
        System.out.print("Product: ");
        System.out.print(prod(23));
    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
    static int prod(int m){
        if (m%10==m){
            return m;
        }
        return (m%10) * prod(m/10);
    }
}
