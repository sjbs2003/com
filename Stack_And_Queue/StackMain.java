package com.Stack_And_Queue;

public class StackMain {
    public static void main(String[] args) throws Exception {
//        DynamicStack stack = new DynamicStack(5);
//
//        stack.push(28);
//        stack.push(23);
//        stack.push(24);
//        stack.push(26);
//        stack.push(25);
//        stack.push(25);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
        Practice stack = new Practice(5);

        stack.push(3);
        stack.push(32);
        stack.push(1);
        stack.push(23);
        stack.push(37);

        System.out.println(stack.remove());

    }
}
