package com.company.easy.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum {
    public static void main(String[] args) {
        int[] nums={2,11,7,15};
        int target=9;

        int[] res=twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ) {
            map.put(nums[i], i++);
            if (map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]), i};
        }
        return new int[] {0, 0};
    }
}
