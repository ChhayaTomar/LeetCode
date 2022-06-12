package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Maximum_erasure_value_1695 {
    public static void main(String[] args) {
        int[] nums={187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        System.out.println(maximumUniqueSubarray(nums));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                sum+=nums[i];
            }
        }
        return sum;
    }
}
