package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Valid_anagram_242 {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }

    private static boolean isAnagram(String s, String t) {
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String sNew=new String(sArr);
        String tNew=new String(tArr);

        if(sNew.equals(tNew)) return true;
        return false;
    }
}
