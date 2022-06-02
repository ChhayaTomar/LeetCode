package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class First_unique_character_in_a_string_387 {
    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
        HashMap<Character, Integer> hmap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
            }else{
                hmap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(hmap.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
