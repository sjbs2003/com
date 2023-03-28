package com.firstcodes1;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* float num = input.nextFloat();
        System.out.println(num);
           */
        //type casting
        /*int num = (int)(67.86f);
        System.out.println(num);
        */

        // automatic type promotion in expression
        /*int a =257;
        byte b= (byte)(a);
        System.out.println(b);   // 257 % 256 = 1
         */


        /*byte a =40;
        byte b=50;
        byte c=100;
        int d =a*b/c;         // a,b,c are cnvrt into int then the task is performed
        System.out.println(d);
         */

       /* byte b=50;
        b=b*2;                  // will give an error
        */

       /* int num ='A';
        System.out.println(num);  // will rtn ascii value
        */

       // System.out.println("안녕하세요");
       // System.out.println("नमस्ते");          w r unicode value but here it is not

       /* byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
        */

    }
}
