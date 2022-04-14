package com.company.easy;

import java.util.*;

public class Last_stone_weight_1046 {
    public static void main(String[] args) {
        int[] stones={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }

    private static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i:stones) {
            pq.add(i);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                pq.add(x-y);
            }
        }
        if(pq.size()==1) return pq.poll();
        return 0;
    }
}
