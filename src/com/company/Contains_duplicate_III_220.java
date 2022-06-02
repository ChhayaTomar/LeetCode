package com.company;

import java.util.HashMap;

public class Contains_duplicate_III_220 {
    public static void main(String[] args) {
        int[] nums={-2147483648,2147483647};
        int k=1;
        int t=1;
        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));
    }

    private static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        //HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length-k;i++){
            for(int j=i+1;j<=i+k;j++){
                long a=Math.abs(nums[i]-nums[j]);
                System.out.println(a);
                if((Math.abs(nums[i]-nums[j])) <=t) return true;
            }
        }
        return false;
    }
}
