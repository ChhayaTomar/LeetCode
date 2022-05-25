package com.company.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Smallest_string_with_swaps_1202 {
    public static void main(String[] args) {
        String s="dcab";
        List<Integer> l1=new ArrayList<>();
        l1.add(0);
        l1.add(3);
        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        List<Integer> l3=new ArrayList<>();
        l3.add(0);
        l3.add(2);
        List<List<Integer>> list=new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        System.out.println(smallestStringWithSwaps(s,list));
    }
    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs){
        String[] words=new String[pairs.toArray().length];
        int n=0;
        char[] str=s.toCharArray();
        for(List<Integer> l : pairs){
            int i=l.get(0);
            int j=l.get(1);
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            words[n]=new String(str);
//            System.out.println(words[n]);
            n++;
        }
        Arrays.sort(words);
        return words[0];
    }
}
