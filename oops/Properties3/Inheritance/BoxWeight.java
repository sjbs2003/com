package com.oops.Properties3.Inheritance;

public class BoxWeight extends Box{

    double weight;
    public BoxWeight(){

        this.weight=-1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight=weight;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // this is calling parent class constructor
        // use to initialize values present in parent class
        this.weight =weight;

//        System.out.println(super.weight); // calling weight from Box

    }

}
