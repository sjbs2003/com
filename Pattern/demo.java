package com.Pattern;

public class demo {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i =1; i<=n; i++ ) {
            for (int j =5; j>=1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
