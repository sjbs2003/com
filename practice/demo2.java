package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[4][4];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= 4; col++) {
                if (row>=col){
                    System.out.print(arr[row][col]);
                }
            }
            System.out.println();

        }
        System.out.println();

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row<=col){
                    System.out.print(arr[row][col]);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}