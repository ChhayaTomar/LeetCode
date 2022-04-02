package com.company.easy;

public class Sign_of_the_product_of_an_array {
    public static void main(String[] args) {
        int[] nums={8,-73,-92,-20,-50,-60,-70};
        System.out.println(arraySign(nums));
    }

    private static int arraySign(int[] nums) {
        int n = nums.length;
        int p = 1;
        for (int i = 0; i < n; i++) {
            int c = p * nums[i];
            if (c == 0) return 0;
            if (c > 0) p = 1;
            else {
                p = -1;
            }
        }
        return p;
    }
}
