package com.LeetCode.Stack_And_Queue;

import java.util.Stack;
//https://leetcode.com/problems/baseball-game/
public class BaseBallGame {
    public static void main(String[] args) {

    }

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("D")) {
                stack.push(2* stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum = sum + stack.pop();
        }
        return sum;
    }
}
