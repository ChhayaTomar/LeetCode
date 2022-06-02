package com.company;

public class Climbing_stairs_70 {
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        System.out.println(climbStairs(n,dp));
    }

    private static int climbStairs(int n,int[] dp) {
        if(n==0 || n==1) return 1;
        if(dp[n]>0) return dp[n];
        for (int i = 2; i < n+1; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
