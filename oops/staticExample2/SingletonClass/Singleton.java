package com.oops.staticExample2.SingletonClass;

public class Singleton {

    private Singleton(){

    }
    public static Singleton instance;

    public static Singleton getInstance(){
        // check whether 1 obj is created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
