package com.company.easy;

import java.util.Arrays;

public class Count_duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicates(arr));
    }

    private static boolean containsDuplicates(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
