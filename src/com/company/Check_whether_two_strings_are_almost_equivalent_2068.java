package com.company;

import java.util.HashMap;
import java.util.Map;

public class Check_whether_two_strings_are_almost_equivalent_2068 {
    public static void main(String[] args) {
        String word1 = "abcdeef";
        String word2 = "abaaacc";
        System.out.println(checkAlmostEquivalent(word1, word2));
    }

    private static boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            Character ch = word1.charAt(i);
            if (hmap.containsKey(ch)) {
                hmap.put(ch, hmap.get(ch) + 1);
            } else {
                hmap.put(ch, 1);
            }
        }
        for (int i = 0; i < word2.length(); i++) {
            Character ch = word2.charAt(i);
            if (hmap.containsKey(ch)) {
                hmap.put(ch, hmap.get(ch) - 1);
            } else {
                hmap.put(ch, 1);
            }
        }
        boolean flag = true;
        for (Map.Entry entry: hmap.entrySet()) {
            if(hmap.get(entry) >3){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
