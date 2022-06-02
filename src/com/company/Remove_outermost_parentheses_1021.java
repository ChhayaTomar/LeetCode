package com.company;

public class Remove_outermost_parentheses_1021 {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    private static String removeOuterParentheses(String s) {
        String str = "";
        int open=1;
        int close=0;
        for (int i = 1; i <s.length() ; i++) {
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }
            if(c==')'){
                close++;
            }
            if(open!=close){
                str+=c;
            }
            if(open==close){
                open=1;
                close=0;
                i++;
            }
        }
        return str;
    }
}
