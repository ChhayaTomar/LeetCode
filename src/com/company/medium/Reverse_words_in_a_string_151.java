package com.company.medium;

import java.util.Locale;

public class Reverse_words_in_a_string_151 {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        s.trim();
        String[] arr=s.split(" ");
        String s2="";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()!=0){
                s2+=arr[i] + " ";
            }
        }
        s2.trim();
        return s2;
    }
}
