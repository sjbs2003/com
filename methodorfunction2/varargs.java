package com.methodorfunction2;

import java.util.Arrays;

public class varargs {
    // VARIABLE LENGTH ARGUMENTS
    public static void main(String[] args) {

        //fun(1,2,3,6,4,8,689,9,7,78);
        //multiple(1,2,"Shri","Shrini","Suraj");
        demo(1,2,3,65,4);
        // demo can be modified for int or strin
    }

    private static void demo(int...v) {
        System.out.println(Arrays.toString(v));
    }
    private static void demo(String...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));

    }
}
