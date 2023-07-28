package com.oops.Interface5;

public class Radio implements Media {
    @Override
    public void start() {
        System.out.println("Radio starts");
    }

    @Override
    public void stop() {
        System.out.println("Radio stops");
    }
}
