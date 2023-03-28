package com.Recursion.SubsetSequenceStringQ;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
        //subseq("","abc");
        SubSeqRetASCII("","abc");
        //System.out.println(SubSeqRet("","abc"));
        System.out.println(SubSeqASCIIRet("","abc"));
    }
    // printing subset of abc
    static void subseq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    // printing subset of abc in an arraylist or in array

    static ArrayList<String> SubSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = SubSeqRet(p+ch,up.substring(1));
        ArrayList<String> right = SubSeqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    // Printing ASCII values of a character
    static void SubSeqRetASCII(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        SubSeqRetASCII(p+ch,up.substring(1));
        SubSeqRetASCII(p,up.substring(1));
        SubSeqRetASCII(p+(ch+0),up.substring(1));
    }

    // Subsequences with ASCII values in ArrayList
    static ArrayList<String> SubSeqASCIIRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = SubSeqRet(p+ch,up.substring(1));
        ArrayList<String> second = SubSeqRet(p,up.substring(1));
        ArrayList<String> third = SubSeqRet(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
