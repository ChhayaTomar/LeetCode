package com.company.easy;

import java.util.Stack;

public class Best_time_to_buy_and_sell_stock_121 {
    public static void main(String[] args) {
        int[] prices={2,4,1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int n=prices.length;
        int minIndex=0;
        int profit=0;

        for (int i = 1; i < n; i++) {
            if(prices[i]<prices[minIndex]){
                minIndex=i;
            }
            else if(prices[i]-prices[minIndex] > profit){
               profit=prices[i]-prices[minIndex];
            }
        }
        return profit;
    }
}
