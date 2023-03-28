package com.methodorfunction2;

import java.util.Scanner;

public class stringex {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter what ever u want: ");
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

    private static String mygreet(String name) {
        String message = "Hello " + name ;
        return message;

    }


    private static String greet() {
        String greeting = "how are u biki ?";
        return greeting;
    }
}
