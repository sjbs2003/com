package com.methodorfunction2;

public class scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 8;
        String name = "Suraj";

        {
//            int a = 6;  already initialised you cannot assign or change value like this
            a=7;//reassign the origin re variable to some other value
            System.out.println(a);
            int c = 1;// values initialised in this block will remain in this block only
            name ="Shri";
            System.out.println(name);


            //scoping in for loop
            for (int i = 0; i < 4; i++) {
                System.out.println(i);

            }
            //System.out.println(i);  cannot take output here
        }
        System.out.println(a);
        //System.out.println(c);  cannot use outside the block
        System.out.println(name);
    }

}
// anything initialised outside the block like (int a=10) cannot be reinitialised in the
//box but can be updated like a=7


//anything initialised inside the block can be initialised outside but can not use outside
//ex- int c = 1;
