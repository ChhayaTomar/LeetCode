package com.company;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Number_of_students_unable_to_eat_lunch_1700 {
    public static void main(String[] args) {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents(students, sandwiches));
    }

    private static int countStudents(int[] students, int[] sandwiches) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        for (int j = sandwiches.length - 1; j >= 0; j--) {
            stack.push(sandwiches[j]);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int j = 0; j < students.length; j++) {
            queue.add(students[j]);
        }
        int count = 0;
        while (count != queue.size()) { ///
            if (stack.peek() == queue.peek()) {
                stack.pop();
                queue.remove();
                count = 0;
            } else {
                int a = queue.remove();
                queue.add(a);
                count++;
            }
        }
        return queue.size();
    }
}
