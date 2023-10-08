package com.Stack_And_Queue;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
        // Stack is a class here!
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//
//        // Queue is a interface, so we would be using Linked List
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(2);
//        queue.add(5);
//        queue.add(3);
//        queue.add(1);
//        queue.add(4);
//
//        System.out.println(queue);
//        System.out.println("Peek:" + queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue);


        // can be inserted from first and last and same goes for the deletion part as well
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addFirst(3);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
