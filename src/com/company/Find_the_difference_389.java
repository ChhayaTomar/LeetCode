package com.company;

import java.util.*;

public class Find_the_difference_389 {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (tArr[i] != sArr[i]) return tArr[i];
        }

        return tArr[tArr.length - 1];
    }
}
