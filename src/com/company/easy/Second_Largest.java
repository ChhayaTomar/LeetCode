package com.company.easy;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr={5,4,10,1,8};
        int max=arr[0];
        int curr=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                curr=max;
                max=arr[i];
            }else{
                if(arr[i]>curr) {
                    curr = arr[i];
                }
            }
        }
        System.out.println(curr);
    }
}
