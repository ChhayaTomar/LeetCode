package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) System.out.println(nums[i]);
            else if (nums[i] == nums[i + 1]) i++;
            else System.out.println(nums[i]);
        }
    }
}
