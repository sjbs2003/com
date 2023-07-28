package com.oops.Properties3.Polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Shapes circles = new Circle();

        circles.area();
        triangle.area();
        square.area();
        circle.area();
        shape.area();
    }
}
