package com.Stack_And_Queue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);

        stack.push(28);
        stack.push(23);
        stack.push(24);
        stack.push(26);
        stack.push(25);
        stack.push(25);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
