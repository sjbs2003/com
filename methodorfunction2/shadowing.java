package com.methodorfunction2;

public class shadowing {
    static int x = 93;// this will be shadowed at line 10
    public static void main(String[] args) {
        System.out.println(x);//93
        int x;//class variable at line 4 is shadowed by this
        //System.out.println(x);// this will not be able to give value of x
        x=46;
        System.out.println(x);//46
        fun();
    }
    static void fun() {
        System.out.println(x);//93
    }
}
