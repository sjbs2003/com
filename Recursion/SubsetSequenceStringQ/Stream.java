package com.Recursion.SubsetSequenceStringQ;

public class Stream {
    public static void main(String[] args) {
        //Skip a character
        skip("","baccdah");
        System.out.println(skip("baccdah"));
        System.out.println(skipApple("applebcvkk"));
        System.out.println(skipAppNotApple("bcaddappnfg"));
    }

    static void skip(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);//every element from up is being stored at ch from 0th index
        if(ch=='a'){
            skip(p,up.substring(1));
            //Substring -> String class that is used to create smaller strings from the bigger one.
        } else {
            skip(p+ch,up.substring(1));
        }
    }


    static String skip(String up) {
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skipApple(up.substring(1));
        } else {
            return ch + skipApple(up.substring(1));
        }
    }


    static String skipApple(String up) {
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else {
            return ch + skipApple(up.substring(1));
        }
    }


    static String skipAppNotApple(String up) {
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        } else {
            return ch + skipAppNotApple(up.substring(1));
        }
    }
}
