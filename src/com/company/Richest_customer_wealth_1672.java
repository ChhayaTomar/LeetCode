package com.company;

public class Richest_customer_wealth_1672 {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int rows=accounts.length;
        int columns=accounts[0].length;
        int maxWealth=Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            int wealth=0;
            for (int j = 0; j < columns; j++) {
                wealth+=accounts[i][j];
            }
            maxWealth=Math.max(maxWealth,wealth);
        }
        return maxWealth;
    }
}
