package com.Recursion;

public class NUmExWithRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int i) {
        //base condition
        if (i==5){
            System.out.println(5);
            return;
        }
        System.out.println(i);

        //recursive call
        //if you are calling a function again & again, u can treat it as a separate call in stack

        //this is called tail recursion
        //this is the last function called
        print(i+1);
    }
}
