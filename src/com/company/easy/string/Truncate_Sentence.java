package com.company.easy.string;

public class Truncate_Sentence {
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        int k=4;

        String[] arr=s.split(" ");
        s="";
        for (int i = 0; i < k; i++) {
            if(i==k-1){
                s+=arr[i];
            }else{
                s+=arr[i]+" ";
            }
        }
        System.out.println(s);

    }
}
