package com.oops.Video1;

public class wrapperClasses {
    public static void main(String[] args) {
//        final int bonus = 2;
//        bonus = 3;

        final A Suraj = new A("Suraj Barik");
        Suraj.name="Biki";

        //when a non primitive is final, you cannot reassign it.
       // Suraj = new A("viki");

        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj= new A("Random person");
        }
    }

}

class A{
//    final int num;
    //always initialize while declaring it

    final int num = 10;
    String name ;

    public A(String name){
        this.name =name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object is destroyed");
    }
}
