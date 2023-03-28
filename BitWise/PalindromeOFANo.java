package com.BitWise;

public class PalindromeOFANo {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(ispalindrome(x));
    }

    static boolean ispalindrome(int x){
        int original= x;
        int y=0;
        while(x>0){
            int z=x%10;
            x=x/10;
            y=y*10+z;
        }
        return original == y;
    }
}
