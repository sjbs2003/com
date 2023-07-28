package com.oops.Properties3.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        // super(); Object class
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    // cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    Box(double height,double length, double width){
        this.h = height;
        this.l = length;
        this.w = width;

    }

    public void information() {
        System.out.println("Running the box");
    }
}
