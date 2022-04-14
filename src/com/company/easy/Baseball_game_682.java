package com.company.easy;

import java.util.Stack;

public class Baseball_game_682 {
    public static void main(String[] args) {
        String[] ops= {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] ops) {
        int n=ops.length;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < n; i++) {
            if(ops[i].equals("C")){
                stack.pop();
            }else if(ops[i].equals("D")){
                stack.push(stack.peek() * 2);
            }else if(ops[i].equals("+")){
                int a=stack.pop();
                int b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }else{
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
