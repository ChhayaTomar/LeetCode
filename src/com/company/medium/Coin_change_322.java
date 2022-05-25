package com.company.medium;

public class Coin_change_322 {
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=11;
        int[] dp=new int[amount+1];
        System.out.println(coinChange(coins, amount,dp));
    }

    private static int coinChange(int[] coins, int amount,int[] dp) {
        //Top-down approach-> Will get TLE bcoz of too many recursion call
//        if(amount==0) return 0;
//        //if(amount<0) return 0;
//        if(dp[amount]!=0) return dp[amount];
//        int minCoin=Integer.MAX_VALUE;
//        for (int i=0;i<coins.length;i++){
//           if(amount-coins[i]>=0){
//               minCoin=Math.min(coinChange(coins,amount-coins[i],dp)+1,minCoin);
//               dp[amount]=minCoin;
//           }
//        }
//        if(dp[amount]==0) return -1;
        return dp[amount];
    }
}
