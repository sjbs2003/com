package com.practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    static boolean balancedParenthesis(String s){
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);

            if(x=='(' || x=='{'||x=='['){
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                }
            }
        }
        return(stack.isEmpty());
    }
    public static void main(String[] args){


        Scanner sj = new Scanner(System.in);
        String s = sj.nextLine();
        if(balancedParenthesis(s))
            System.out.println("balanced");
        else
            System.out.println("! balanced");
    }
}

