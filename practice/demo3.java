package com.practice;

public class demo3 extends Throwable {
    public static void main(String[] args) {
        try{
            String s ="null";
            System.out.println(s);
            System.out.println(Integer.parseInt(s));
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("sjb_s2003");
        }
    }
}
