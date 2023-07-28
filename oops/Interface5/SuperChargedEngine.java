package com.oops.Interface5;

public class SuperChargedEngine implements Engine{
    @Override
    public void start() {
        System.out.println("SuperChargedEngine starts");
    }

    @Override
    public void stop() {
        System.out.println("SuperChargedEngine stops");
    }

    @Override
    public void acc() {
        System.out.println("SuperChargedEngine accelerate really fast!");
    }
}
