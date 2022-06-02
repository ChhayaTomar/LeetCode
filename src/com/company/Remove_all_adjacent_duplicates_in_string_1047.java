package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;

public class Remove_all_adjacent_duplicates_in_string_1047 {
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
//abbaca
    private static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
                i++;
            }else{
                stack.push(s.charAt(i));
                i++;
            }
        }
        String s2="";
        Stack<Character> stack2=new Stack<>();
        while(!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        while(!stack2.isEmpty()){
            s2+=stack2.pop();
        }
        return s2;
    }
}
