package com.oops.staticExample2;

public class Innerclass {

    static class test{
        String name;
        public test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        test a = new test("Suraj");
        test b = new test("Sj");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
