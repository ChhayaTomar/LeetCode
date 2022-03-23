package com.company.easy.arrays;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int n=arr.length;
        int[] newArr=new int[n+n];

        for (int i = 0; i <n*2 ; i++) {
            if(i<n) newArr[i]=arr[i];
            else newArr[i]=arr[i-n];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
