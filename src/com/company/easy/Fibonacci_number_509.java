package com.company.easy;

import java.util.Arrays;

public class Fibonacci_number_509 {
    public static void main(String[] args) {
        int n=8;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n,dp));
    }

    private static int fib(int n,int[] dp) {
            if(n==0) return 0;
            if(n==1) return 1;
            if(dp[n]!=-1){
                return dp[n];
            }
            dp[n]= fib(n-1,dp)+fib(n-2,dp);
            return dp[n];
    }
}
