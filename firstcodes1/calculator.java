package com.firstcodes1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take the input from user till user press x or X
        int ans = 0;
        while (true) {
            //take the operator as input
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '%' || op == '*' || op == '-' || op == '+'|| op == '/') {
                //input the 2 no.s\
                System.out.println("Enter 2 number:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }else if(op == 'x' || op=='X'){
                    break;
                }else{
                    System.out.println("Invalid Operation!!");
                }
                System.out.println(ans);
            }
        }
    }
}

