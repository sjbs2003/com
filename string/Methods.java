package com.string;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Shri Suraj Barik";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('B'));
    }
}
