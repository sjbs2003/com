package com.oops.Properties3.Polymorphism;

public class CompileTimeOver {
    double sum(double a, int b){
        return a+b;             // casting happens here, that how double value is being taken as int in main()
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        CompileTimeOver obj = new CompileTimeOver();


        obj.sum(1,3);
        obj.sum(1,5,76);

//        obj.num(1,4,5,6);
    }
}
