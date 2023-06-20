package com.oops.Video1;

public class constructor {
    public static void main(String[] args) {
        student sj = new student();   // student() is a constructor

//        sj.Alais="GAY";
//        sj.marks=88;
//        sj.rno=44;
//        sj.Name="Abhay";

//        System.out.println(sj.rno);
//        System.out.println(sj.Name);
//        System.out.println(sj.marks);
//        System.out.println(sj.Alais);

//        sj.changeName("Suraj");
//        sj.greeting();

        student saj = new student(sj);
        System.out.println(saj.Name);

        student saj2 = new student();
        System.out.println(saj2.Name);

        // memory allocation of new key word
        student one = new student();
        student two = one;

        one.Name="Bhendi";
        System.out.println(two.Name);
    }

    static class student {
        int rno = 1;
        String Name = "Samriti";
        String Alais = "Shri";
        int marks = 1;

        // we need a way to add the values of the above properties object by object

        // we need one word to access every object i.e, this4
        void changeName(String newName) {
            Name = newName;
        }
        void greeting() {
            System.out.println("Hello!, My name is " + this.Name);
        }

// there are 2 student constructors one is empty and another one is parameterized,
// so constructor is overloading.
        student(student other){
            this.Name = other.Name;
            this.Alais = other.Alais;
            this.rno = other.rno;
            this.marks =other.marks;

        }

//        student() {
//            this.Alais = "Jamal";
//            this.marks = 100;
//            this.rno = 143;
//            this.Name = "Suraj Barik";        // this will replace student.Name
//        }

        student() {
            //this is how you call a constructor from a constructor
            // internally it is : new student("sj",70,41,"Saj");
            this("sj",70,41,"Saj");

        }

        student(String Aka, int mark, int roll, String Name) {
            this.Alais = Aka;
            this.marks = mark;
            this.rno = roll;
            this.Name = Name;
        }
    }
}
