package com.company;

import java.util.*;

//public class Next_greater_element_II_503 {
//    public static void main(String[] args) {
//        int[] nums={5,4,3,2,1};
//        int[] res=nextGreaterElements(nums);
//        System.out.println(Arrays.toString(res));
//    }
//
//    private static int[] nextGreaterElements(int[] nums) {
//        int n=nums.length;
//        Stack<Integer> stack = new Stack<>();
//        HashMap<Integer, Integer> hmap=new HashMap<>();
//        stack.push(0);
//        int[] res = new int[n];
//        for (int i = 1; i < 2*n-1; i++) {
//            while (!stack.isEmpty() && nums[i%n] > nums[stack.peek()]) {
//                int a=stack.pop();
//                res[a] = nums[i%n];
//            }
//            stack.push(i%n);
//        }
//        while (!stack.isEmpty()) {
//            res[stack.pop()] = -1;
//        }
//
//        return res;
//    }
//}
