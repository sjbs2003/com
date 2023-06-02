package com.oops;

public class constructor {
    public static void main(String[] args) {
        student students = new student();   // student() is a constructor

//        students.Alais="GAY";
//        students.marks=88;
//        students.rno=44;
//        students.Name="Abhay";

        System.out.println(students.rno);
        System.out.println(students.Name);
        System.out.println(students.marks);
        System.out.println(students.Alais);

    }
    static class student{
        int rno=1;
        String Name="Samriti";
        String Alais="Shri";
        int marks=1;

        // we need a way to add the values of the above properties object by object

        // we need one word to access every object i.e, this
        student(){
            this.Alais="FANTA";
            this.marks=100;
            this.rno=143;
            this.Name="Samriti";        // this will replace student.Name 

        }
    }
}
