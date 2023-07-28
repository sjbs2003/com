package com.oops.Abstract5;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.career();
        son.partner();

//        Parent mum = new Parent();   we cannot create object of Abstract class!

        Parent.hello();
    }
}
