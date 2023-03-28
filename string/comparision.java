package com.string;

import org.w3c.dom.ls.LSOutput;

public class comparision {
    public static void main(String[] args) {
        String a = "Shri";
        String b = "Shri";
        System.out.println(a.equals(b));  //true

        System.out.println(a);   //Shri
        b="bar";
        System.out.println(b);   //bar

        String n1 = new String ("Shri");
        String n2 = new String ("Shri");
        System.out.println(n1==n2);  //false
        System.out.println(n1.equals(n2));  //true
    }
}
