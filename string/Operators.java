package com.string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//195
        System.out.println("a"+"b");//ab
        System.out.println((char)('a' + 3));//d TYPECASTING
        System.out.println("a"+1);//a1

        System.out.println("Shri"+ new ArrayList<>());// bcoz array is empty and it is converted into string

        System.out.println("Shri" + new Integer(93));//it will work bcoz of println instead of an error9-

        String ans =new Integer(93)+""+new ArrayList<>();
        System.out.println(ans);//93[]

    }
}
