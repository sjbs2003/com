package com.linear4;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Shri";
        char target = 's';
        System.out.println(search(name, target));
        //System.out.println(Arrays.toString(name.toCharArray()));
        //will create name array
    }
    static boolean search2(String str, char target) {
        if(str.length() == 0){ //will be going to check from the length
            return false;
        }
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target) {
        if(str.length() == 0){ //will be going to check from the length
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){ // w b going to check from each character
                return true;
            }
        }
        return false;
    }

}
