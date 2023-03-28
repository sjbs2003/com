package com.firstcodes1;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter temp in c: ");
        float tempC = in.nextInt();
        float tempF = (tempC * 9/5)+32;
        System.out.println(tempF);
    }
}
