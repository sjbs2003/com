package com.oops.Generics6;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

//    public void add(int num){
//        if (isFull()) resize();
//        data[size++] = num;
//    }

    private boolean isFull() {
        return size == data.length; // isFull will return the size of 'data' Array
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

    }
}
