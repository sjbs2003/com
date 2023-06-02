package com.Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert decimal to binary
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);

        // Convert decimal to octal
        System.out.print("Enter a decimal number: ");
        decimal = scanner.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal representation: " + octal);
    }
}


