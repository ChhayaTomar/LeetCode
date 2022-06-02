package com.company;

import java.util.HashSet;

public class Longest_substring_without_repeating_characters_3 {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int start=0;
        int maxlen=Integer.MIN_VALUE;
        while (i<s.length()){
            char c=s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                i++;
                maxlen=Math.max(set.size(),maxlen);
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxlen;
    }
}
