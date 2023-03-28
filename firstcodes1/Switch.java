package com.firstcodes1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("red and sweet");
            case "Grape" -> System.out.println("small and sour");
            case "Orange" -> System.out.println("funky round");
            default -> System.out.println("try something known");
        }

       */
        /*
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Wrong no");

         */


          /*
            int day = in.nextInt();
            if (day == 1) {
                System.out.println("monday");
            } else if (day == 2) {
                System.out.println("tuesday");
            } else if (day == 3) {
                System.out.println("wednesday");
            } else if (day == 4) {
                System.out.println("thursday");
            } else if (day == 5) {
                System.out.println("friday");
            } else if (day == 6) {
                System.out.println("saturday");
            } else if (day == 7) {
                System.out.println("sunday");
            } else {
                System.out.println("Wrong no");
            }

           */
        /*int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("weekend");
         */
        int empid = in.nextInt();
        String department = in.next();

        switch (empid) {
            case 1 -> System.out.println("Suraj Barik");
            case 2 -> System.out.println("shri");
            case 3 -> {
                System.out.println("empno.3");
                switch (department) {
                    case "it" -> System.out.println("it department");
                    case "mn" -> System.out.println("management department");
                    default -> System.out.println("incorrect department");
                }
            }
            default -> System.out.println("enter correct empid");
        }

    }

}


