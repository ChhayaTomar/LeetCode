package com.company;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((top == '(' && curr == ')') ||
                        (top == '{' && curr == '}') ||
                        (top == '[' && curr == ']')) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }

}

/*
public class ValidParentheses {
    public static void main(String[] args) {
        String s="(]";
        char[] arr=s.toCharArray();

        boolean flag=true;
        if(arr.length==2){
            if(arr[0]=='(' && arr[1]==')') flag=true;
            else if(arr[0]=='[' && arr[1]==']') flag = true;
            else if (arr[0]=='{' && arr[1]=='}') flag = true;
            else {
                flag=false;
            }
        }else{
            for(int i=0;i<arr.length-2;i=i+2){
                if(arr[i]=='(' && arr[i+1]==')') flag=true;
                else if(arr[i]=='[' && arr[i+1]==']') flag = true;
                else if (arr[i]=='{' && arr[i+1]=='}') flag = true;
                else {
                    flag=false;
                    break;
                }
            }
        }

        System.out.println(flag);;
    }
}
*/
