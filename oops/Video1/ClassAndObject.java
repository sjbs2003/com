package com.oops.Video1;

class car{
    String color;
    int speed;

    public void drive(){
        System.out.println("A " + color + " color car was going at a speed of " + speed + " towards you !");
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        car myCar = new car();
        myCar.color = "Red";
        myCar.speed = 140;
        myCar.drive();

    }
}
