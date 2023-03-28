package com.practice;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    /*
    A Of Circle Java Program    pi*r*r
    A Of Triangle   .5*b*h
    A Of Rectangle Program  b*h
    A Of Isosceles Triangle   .5*b*h
    A Of Parallelogram      b*h
    A Of Rhombus      0.5*d1*d2
    A Of Equilateral Triangle    root3/4*a*a   (1.73*A*A)/4
    Per Of Circle      2pi*r
    Per Of Equilateral Triangle     3a
    per Of Parallelogram     2(a+b)
    Per Of Rectangle        2(l+b)
    Per Of Square           4a
    Per Of Rhombus      4a
    V Of Cone     pi r*r*h/3
    V Of Prism       area of any shape (tri,rec,pentagon,etc) * length
    V Of Cylinder    pi*r*r*h
    V Of Sphere     4*pi*r3/3
    V Of Pyramid    lbh/3
    C.S.Area Of Cylinder    2pi*r*h
    T.S.Area Of Cube        6a2
    Fibonacci Series In Java Programs   -   in first code section
    Subtract the Product and Sum of Digits of an Integer
    Input a number and print all the factors of that number (use loops).
    Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    Take integer inputs till the user enters 0 and print the largest number from all.
    Addition Of Two Numbers
    */
        int n = in.nextInt();
        int pod=1;
        int sod=0;
        int x;
        while(n>0){
            x=n%10;
            pod=pod*x;
            sod=sod+x;
            n=n/10;
        }
        System.out.println(pod-sod);
    }

}
