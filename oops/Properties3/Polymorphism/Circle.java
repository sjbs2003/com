package com.oops.Properties3.Polymorphism;

public class Circle extends Shapes{

    // this will run when object of circle is created
    // hence it is overriding the parent method
    @Override // this is an annotation
    void area(){
        System.out.println("Area of circle is: pi * r * r ");
    }
}
