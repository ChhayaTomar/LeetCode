package com.company;

import java.util.Arrays;

public class Longest_consecutive_sequence_128 {
    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=1;
        int longestSeq=1;
        for(int i=1;i<nums.length;i++){
            if((nums[i]-nums[i-1])==1){
                count++;
                longestSeq=Math.max(count,longestSeq);

            }else if(nums[i]==nums[i-1]){
                continue;
            }else{
                count=1;
            }
        }
        return longestSeq;
    }
}
