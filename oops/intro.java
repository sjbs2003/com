package com.oops;

public class intro {
    public static void main(String[] args) {

        student suraj = new student();

        suraj.name = "Suraj Barik";
        suraj.marks=80.5f;
        suraj.rollno=40;

        System.out.println(suraj.marks);
        System.out.println(suraj.rollno);
        System.out.println(suraj.name);

    }
    //create a class
    static class student{
        int rollno;
        String name;
        float marks;
    }
}
