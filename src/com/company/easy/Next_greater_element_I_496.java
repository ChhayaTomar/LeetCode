package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Next_greater_element_I_496 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] res = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }


    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = nextGreater(nums2, n2);
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < n2; i++) {
            hmap.put(nums2[i], arr[i]);
        }

        for (int i = 0; i < n1; i++) {
            if (hmap.containsKey(nums1[i])) {
                nums1[i] = hmap.get(nums1[i]);
            }
        }
        return nums1;
    }

    private static int[] nextGreater(int[] nums2, int n2) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int si = 1;
        int[] arr = new int[n2];
        for (int i = 1; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                arr[stack.pop()] = nums2[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }
        return arr;
    }
}
