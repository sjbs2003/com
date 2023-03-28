package com.methodorfunction2;

public class overloading {
    public static void main(String[] args) {

        //fun("Shri");//can interchange this function to print which one u
        //fun(93);// NEED TO print first or the way u want

        int ans = sum(5,6);
        //int ans = sum(5,6,5);
        System.out.println(ans);

    }
    static int  sum(int x, int y){
        return x + y;
    }
    static int  sum(int x, int y, int z) {
        return x + y + z;
    }


    //at compile time the function decide which one to run
    static void fun(int a) {
        System.out.println(a);

    }

    static void fun(String name) {
        System.out.println(name);

    }

}
