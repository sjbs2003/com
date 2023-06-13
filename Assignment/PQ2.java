package com.Assignment;
import java.util.StringTokenizer;

public class PQ2 {
    public static void main(String[] args) {
        String longString = "This is a long string with multiple words!";
        StringTokenizer tokenizer = new StringTokenizer(longString);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
