package com.oops.Interface5;

public class Car implements Engine,Brake,Media{
    @Override
    public void start() {
        System.out.println("I start like a truck!");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a scooter!");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a jet!");
    }

    @Override
    public void brake() {
        System.out.println("I brake like a Ship/Vessel!  ");
    }
}
