package com.oops.staticExample2;


// this is a demo to show initialisation of static variable
public class StaticBlock {
    static int a=4;
    static int b;


    static {
        // this statement will only be printed once when the class is loaded
        System.out.println("This is a static block");
        b = a * 5;

    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " "+ StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
    }
}
