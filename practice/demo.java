package com.practice;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        circumference(radius);
        areaOfCircle(radius);
    }

    static void areaOfCircle(float radius) {
        double area =(float) Math.PI*2*radius;
        System.out.println(area);
    }

    static void circumference(float radius) {
        float circum=(float) Math.PI*radius*radius;
        System.out.println(circum);
    }
}
