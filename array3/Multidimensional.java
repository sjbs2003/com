package com.array3;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
                1 2 3
                4 5 6
                7 8 9
         */
        //int[][] arr = new int[3][3];
/*        int[][] arr = {
                {1,2,3},// 0th index
                {4,5},// 1st index
                {6,7,8,9}// 2nd index -> arr = [6,7,8,9]
        };
 */
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        // input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
/*        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
 */
        //output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}