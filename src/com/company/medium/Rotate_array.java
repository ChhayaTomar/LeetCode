package com.company.medium;

import java.util.Arrays;

public class Rotate_array {
    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotateArr(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    //4 3 2 1 7 6 5 ---- 5 6 7 1 2 3 4
    private static void rotateArr(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        swap(nums, 0, n - k - 1);
        swap(nums, n - k, n - 1);
        swap(nums, 0, n - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
