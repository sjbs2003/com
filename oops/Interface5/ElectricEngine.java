package com.oops.Interface5;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine starts quietly");
    }

    @Override
    public void stop() {
        System.out.println("Engine stops quietly");
    }

    @Override
    public void acc() {
        System.out.println("Engine accelerate violently!");
    }
}
