package com.array3;

public class main {
    public static void main(String[] args) {
        //Q: Store a roll no.
        int a = 1;

        //Q:Store a persons name
        String naam = "Shri";

        //Q: Store 5 roll nos.
        int ron1 = 2;
        int ron2 = 1;
        int ron3 = 4;
        int ron4 = 3;
        int ron5 = 6;

        // syntax
        // datatype[]variable_name=new datatype[size];
        // store 5 roll numbers:
       // int[]rnos=new int[5];
        // or directly
       // int[]rnos2=(23,12,45,32,15); //only integer should be here u can't add string or whatever

        int[]ros;// declaration of array.ros is getting defined in the stack
        ros=new int[5];// actually here object is being created in the memory(heap)

        //System.out.println(ros[1]);

        String[]arr=new String[4];
        System.out.println(arr[0]);
    }
}
