package com.company;

import java.util.Stack;

public class Implement_queue_using_stacks_232 {
    static Stack<Integer> stack1;
    static Stack<Integer> stack2;

    public Implement_queue_using_stacks_232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int res = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    public boolean empty() {
        if (stack1.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        Implement_queue_using_stacks_232 queue = new Implement_queue_using_stacks_232();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.empty());

    }
}
