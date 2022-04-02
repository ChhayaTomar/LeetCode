package com.company.easy;

import java.util.Arrays;

public class Move_zeroes_283 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        for (int k = 0; k < nums.length; k++) {
            if(nums[k]==0) j++;
            if(nums[k]!=0) {
                swap(nums, i, j);
                i++;
                j++;
            }
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
