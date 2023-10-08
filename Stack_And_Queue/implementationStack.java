package com.Stack_And_Queue;

import java.util.Stack;

public class implementationStack {
    public static void main(String[] args) {
        Stack<String> sb = new Stack<>();

        sb.push("Sup");
        sb.push("Dude");
        System.out.println(sb.peek());
        System.out.println(sb.pop());
        System.out.println(sb);

        Stack<Integer> sj= new Stack<>();
        sj.push(1);
        sj.push(220);
        System.out.println(sj);
        System.out.println(sj.peek());
        System.out.println(sj.pop());
        System.out.println(sj);
    }
}
