package com.company;

public class Perfect_squares_279 {
    public static void main(String[] args) {
        int n=12;
        System.out.println(numSquares(n));
    }

    private static int numSquares(int n) {
        if(n<=3) return n;

        int[] dp=new int[n+1];
        for (int i = 1; i <=n; i++) {
            dp[i]=Integer.MAX_VALUE;
            for (int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
