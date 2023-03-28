package com.firstcodes1;
import java.util.Scanner;
public class countingno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int count=0;
        while (n > 0){
            int rem = n % 10;
            if (rem == m){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
