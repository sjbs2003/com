package com.Stack_And_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class implementationQueue {
    public static void main(String[] args) {

        Queue<String> sb = new LinkedList<>();

        sb.add("Bhummi");
        sb.add("A.D");
        sb.add("Ashish");
        sb.add("Tushar");
        System.out.println(sb);
        System.out.println(sb.poll());
        System.out.println(sb.remove());
        System.out.println(sb.peek());
        System.out.println(sb);
    }
}
