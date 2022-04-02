package com.company.easy;

import java.util.Arrays;

public class Largest_perimeter_triangle {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=n-3;i>=0;i--){
            int s=nums[i]+nums[i+1];
            if(s>nums[i+2]) return nums[i]+nums[i+1]+nums[i+2];
        }
        return 0;
    }
}
