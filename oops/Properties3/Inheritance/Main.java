package com.oops.Properties3.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(40.23,82.23,89.00);
//        Box box2 = new Box(box1);  for Box old
//        System.out.println(box1.h+" "+box1.w+" "+ box1.l);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(1,2,3,4);
//        System.out.println(box3.h + " "+ box3.weight);
//
//        Box box5 = new BoxWeight(1,2,3,4);
//        System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref. type i.e, BoxWeight
        //hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here , when the object is itself type parent class, how will you call constructor of child class
        // that is why error occurs here!
//        BoxWeight box6 = new Box(1,2,3,4);


        BoxPrice box =new BoxPrice(2,5,200);


    }
}
