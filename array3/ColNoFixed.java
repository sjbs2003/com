package com.array3;

import java.util.Scanner;

public class ColNoFixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                //arr[row].length kyuki sare index alag alg size ke he to wo row ke hisab se print karenge
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
