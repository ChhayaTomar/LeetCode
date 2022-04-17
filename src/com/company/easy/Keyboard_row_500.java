package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Keyboard_row_500 {
    public static void main(String[] args) {
        String[] words = {"hello", "alaska", "Dad", "Peace"};
        String[] res = findWords(words);
        System.out.println(Arrays.toString(res));
    }

    private static String[] findWords(String[] words) {
        List<String> arrayList = new ArrayList<>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for (int j=0;j<words.length;j++) {
            int c1=words[j].length();
            int c2=c1;
            int c3=c1;
            for(String s:words[j].toLowerCase().split("")) {
                if (s1.contains(s)) c1--;
                if(s2.contains(s)) c2--;
                if(s3.contains(s)) c3--;
            }
            if(c1==0 || c2==0 || c3==0) arrayList.add(words[j]);
        }
        int n=arrayList.size();
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
