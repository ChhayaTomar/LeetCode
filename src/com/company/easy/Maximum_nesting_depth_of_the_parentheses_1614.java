package com.company.easy;

import java.util.Stack;

public class Maximum_nesting_depth_of_the_parentheses_1614 {
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }

    //(1)+((2))+(((3)))
    private static int maxDepth(String s) {
        //Stack<Integer> stack=new Stack<>();
        int open = 0;
        int close = 0;
        int depth = 0;
/*
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') {
                open++;
            }
            if(s.charAt(i)==')'){
                depth=Math.max(open-close,depth);
                close++;
            }
            if(open==close){
                open=0;
                close=0;
            }
        }
        */
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
                depth = Math.max(depth, open);
            }
            if (s.charAt(i) == ')') {
                open--;
            }
        }
        return depth;
    }
}
