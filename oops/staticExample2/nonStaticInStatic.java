package com.oops.staticExample2;

public class nonStaticInStatic {
    public static void main(String[] args) {
//        greeting();  it will not work cause the method called is not greeting
    fun();

    nonStaticInStatic funn =new nonStaticInStatic();
    funn.fun2();

    }


    static void fun(){
//        greeting(); still not working.

        nonStaticInStatic obj = new nonStaticInStatic();
        obj.greeting(); // here it will work

    }
    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("Konichiwa!");
    }
}
