package com.LeetCode;

import java.util.HashMap;

public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if (!map.containsKey(leftChar) || map.get(leftChar) != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        StrobogrammaticNumber strobogrammaticNumber = new StrobogrammaticNumber();

        String num1 = "69";
        String num2 = "88";

        System.out.println(strobogrammaticNumber.isStrobogrammatic(num1)); // Output: true
        System.out.println(strobogrammaticNumber.isStrobogrammatic(num2)); // Output: true
    }
}
