package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_target_array_in_the_given_order_1389 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] target=createTargetArray(nums,index);
        System.out.println(Arrays.toString(target));

        //0,4,1,3,2
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr=new ArrayList<>();
        int[] target=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i],nums[i]);
        }
        int i=0;
        for(int j : arr){
            target[i++]=j;
        }
        return target;
    }
}
