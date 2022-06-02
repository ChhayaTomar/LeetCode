package com.company;

public class Sign_of_the_product_of_an_array {
    public static void main(String[] args) {
        int[] nums = {8, -73, -92, -20, -50, -60, -70};
        System.out.println(arraySign(nums));
    }

    private static int arraySign(int[] nums) {
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            if (nums[i] < 0) neg++;
        }
        if (neg % 2 == 0) return 1;
        else return -1;
    }
}
