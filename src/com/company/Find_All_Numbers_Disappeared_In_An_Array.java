package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Numbers_Disappeared_In_An_Array {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (!hmap.containsKey(i + 1)) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
