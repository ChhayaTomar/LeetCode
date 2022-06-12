package com.company;

import java.util.Arrays;

public class Sum_of_unique_elements_1748 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int sum = 0;
        int j = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != j) {
                if (count == 0) {
                    sum += j;
                    j = nums[i];
                    if (i == nums.length - 1) {
                        sum += j;
                    }
                } else {
                    j = nums[i];
                    count = 0;
                    if (i == nums.length - 1) {
                        sum += j;
                    }
                }
            } else {
                count++;
            }
        }
        return sum;
    }
}
