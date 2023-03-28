package com.string;

public class Performance {
    public static void main(String[] args) {
        String s="";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            System.out.println(ch);// this is fast but not good-looking
            /*      a
                    ...
                    z
             */
            s = s+ch; //abcdefghijklmnopqrstuvwxyz
            //this is slow bcoz it will add every digit again, again by creating new 's'
        }
        System.out.println(s);
    }
}
