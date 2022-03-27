package com.company.easy;

import java.util.HashMap;
import java.util.Map;

public class Remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int nums[]={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){
        int n=nums.length;
        int count=0;
        for (int i = 1; i <n ; i++) {
            if(nums[i]==nums[i-1]){
                count++;
            }else {
                nums[i - count] = nums[i];
            }
        }
        return  (n-count);
    }
}
//    HashMap<Integer,Integer> hmap=new HashMap<>();
//        for (int i:nums) {
//                if(!hmap.containsKey(i)){
//                hmap.put(i,1);
//                }else{
//                hmap.put(i,hmap.get(i)+1);
//                }
//                }
//                int i=0;
//                for (Integer key:hmap.keySet()) {
//                nums[i]=key;
//                i++;
//                }
//                return
