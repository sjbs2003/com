package com.oops.Abstract5;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a Developer!");
    }

    @Override
    void partner() {
        System.out.println("I love Continental GT!");
    }
}
