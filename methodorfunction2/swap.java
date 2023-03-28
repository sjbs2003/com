package com.methodorfunction2;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "Shrini";
        changename(name);
        System.out.println(name);
    }

    static void changename(String naam) {
        naam = "Shri";
        // here we are not modifing the string here we r creating a new object
        // here naam didn't change name bcoz name->shrini he or naam->shri
        //kar dia but abhi bhi ham sout me name mang rahe he so change nahi hoga

        // u cannot access naam outside this func bcoz of "scoping"
    }
}
