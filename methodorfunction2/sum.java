package com.methodorfunction2;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        sum();
//       int ans= sum2();
//        System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);
    }

    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }



    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no.1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the no.2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no.1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the no.2: 10");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum is: " + sum);


    }
}
