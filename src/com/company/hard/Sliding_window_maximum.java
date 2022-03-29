package com.company.hard;

import java.util.Arrays;
import java.util.LinkedList;

public class Sliding_window_maximum {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(res));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        LinkedList<Integer> deque = new LinkedList<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && nums[deque.getLast()] <= nums[i]) {
                deque.removeLast();
            }
            while (!deque.isEmpty() && deque.getFirst() <= i - k) {
                deque.removeFirst();
            }
            deque.addLast(i);
            if (i >= k - 1) {
                arr[j] = nums[deque.getFirst()];
                j++;
            }
        }
        return arr;
    }
}
