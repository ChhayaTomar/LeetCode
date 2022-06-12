package com.company;

public class House_robber_198 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        dp[1]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            dp[i+1]=Math.max(dp[i],dp[i-1]+nums[i]);
        }
        return dp[nums.length];
    }
}
