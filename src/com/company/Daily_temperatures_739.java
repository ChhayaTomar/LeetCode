package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Daily_temperatures_739 {
    public static void main(String[] args) {
        int[] tempratures={73,74,75,71,69,72,76,73};
        int[] res=dailyTemperatures(tempratures);
        System.out.println(Arrays.toString(res));
    }

    private static int[] dailyTemperatures(int[] tempratures) {
        int n=tempratures.length;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int index=1;
        int[] res=new int[n];

        while(index<n){
            while(!stack.isEmpty() && tempratures[index]>tempratures[stack.peek()]){
                int ci=stack.pop();
                res[ci]=index-ci;
            }
            stack.push(index);
            index++;
        }
        while(!stack.isEmpty()){
            res[stack.pop()]=0;
        }
        return res;
    }
}
