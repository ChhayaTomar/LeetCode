package com.company;

public class House_robber_II_213 {
    public static void main(String[] args) {
        int[] nums={2,3,2};
        System.out.println(rob(nums));
    }
    public static  int rob(int[] nums) {
        //including first element
        int[] dp1=new int[nums.length+2];
        for (int i = nums.length-2; i >=0; i--) {
            dp1[i]=Math.max((dp1[i+1]),(dp1[i+2] + nums[i]));
        }

        //including last element
        int[] dp2=new int[nums.length+2];
        for (int i = nums.length-1; i >0; i--) {
            dp2[i]=Math.max((dp2[i+1]),(dp2[i+2] + nums[i]));
        }

        return (Math.max(dp1[0],dp2[1]));
    }
}
