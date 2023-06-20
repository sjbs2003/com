package com.oops.staticExample2.SingletonClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 reference variables are pointing to just 1 object
    }
}
