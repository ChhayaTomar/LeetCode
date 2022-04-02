package com.company.easy;

import java.util.Arrays;

public class Can_make_arithmetic_progression_from_sequence_1502 {
    public static void main(String[] args) {
        int[] arr={3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    private static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=3;i<arr.length;i++){
            if((arr[i]-arr[i-1])!=diff) return false;
        }
        return true;
    }
}
