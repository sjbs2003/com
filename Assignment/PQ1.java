package com.Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PQ1 {
    public static void main(String[] args) {
        // Stack implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Queue implementation
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Mary");
        queue.add("Alice");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
