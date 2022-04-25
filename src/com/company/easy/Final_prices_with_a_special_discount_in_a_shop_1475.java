package com.company.easy;

import java.util.Arrays;
import java.util.Stack;

public class Final_prices_with_a_special_discount_in_a_shop_1475 {
    public static void main(String[] args) {
        int[] prices={10,1,1,6};
        int[] res=finalPrices(prices);
        System.out.println(Arrays.toString(res));
    }

    private static int[] finalPrices(int[] prices) {
        Stack<Integer> stack=new Stack<>();
        int n=prices.length;
        int[] res=new int[n];
        int si=1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && prices[i]<=prices[stack.peek()]){
                int a=stack.pop();
                res[a]=prices[a]-prices[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int a=stack.pop();
            res[a]=prices[a];
        }
        return  res;
    }
}
