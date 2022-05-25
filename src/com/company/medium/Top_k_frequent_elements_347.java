package com.company.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Top_k_frequent_elements_347 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        int[] res=topKFrequent(nums,k);
        System.out.println(Arrays.toString(res));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }else{
                hmap.put(nums[i],1);
            }
        }
        Pair[] arr=new Pair[hmap.size()];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            arr[i++]=new Pair(entry.getKey(),entry.getValue());
        }

        Arrays.sort(arr);
        int l=arr.length-1;
        int[] res=new int[k];
        for (int j=0;j<k;j++){
            res[j]=arr[l--].num;
        }
        return res;
    }
    public static class Pair implements Comparable<Pair>{
        int num;
        int count;

        Pair(int num, int count){
            this.num=num;
            this.count=count;
        }

        @Override
        public int compareTo(Pair o) {
            return this.count-o.count;
        }
    }
}
