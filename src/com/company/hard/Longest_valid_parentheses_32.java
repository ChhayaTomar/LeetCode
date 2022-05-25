package com.company.hard;

import java.util.Stack;

public class Longest_valid_parentheses_32 {
    public static void main(String[] args) {
        String s="()(()";
        System.out.println(longestValidParentheses(s));
    }

    private static int longestValidParentheses(String s) {
        int open=0;
        int close=0;
        int maxLen=Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' && open!=0 && close!=0 && open!=close){
                open++;
            }else if(s.charAt(i)=='(' && open!=0 && close!=0 && open==close){
                maxLen=Math.max(maxLen,close*2);
                open=0;
                close=0;
            }else if(s.charAt(i)=='(' && open==0){
                open++;
            }else if(s.charAt(i)==')' && open>close){
                close++;
                maxLen=Math.max(maxLen,close*2);
            }else{
                open=0;
                close=0;
            }
        }
        return maxLen;
    }
}
