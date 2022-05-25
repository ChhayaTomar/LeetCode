package com.company.easy;

import java.util.Arrays;

public class Shuffle_the_array_1470 {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] res=shuffle(nums,n);
        System.out.println(Arrays.toString(res));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int j=0;
        for (int i = 0; i <n ; i++) {
            res[j]=nums[i];
            res[j+1]=nums[i+n];
            j+=2;
        }
        return res;
    }
}
