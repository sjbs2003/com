package com.Pattern;

public class pattern {
    public static void main(String[] args) {

        pattern6(5);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalColumnsInRows = row>n ? 2*n - row  : row;
            for (int col = 1; col <totalColumnsInRows ; col++) {

//            }
//            int totalColumnsInRows = row>n ? 2*n - row : row;
//            for (int col = 1; col <=totalColumnsInRows ; col++) {
                    System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern6(int n){
        for (int i = 0; i <=n ; i++) {
            //space
            for (int j = 0; j <=n-i-1 ; j++) {
                System.out.print(" ");
            }
            //star
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");

            }
            //space
            for (int l = 0; l < n-i-1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
