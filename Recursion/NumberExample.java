package com.Recursion;

public class NumberExample {
    public static void main(String[] args) {
        printn1(1);
    }

    static void printn1(int i) {
        System.out.println(i);
        printn2(2);
    }
    static void printn2(int i) {
        System.out.println(i);
        printn3(3);
    }
    static void printn3(int i) {
        System.out.println(i);
        printn4(4);
    }
    static void printn4(int i) {
        System.out.println(i);
        printn5(5);
    }
    static void printn5(int i) {
        System.out.println(i);
    }
}
