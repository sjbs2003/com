package com.string;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        // this one is fast mutable not like performance which is immutable

        System.out.println(builder.reverse());
    }
}
