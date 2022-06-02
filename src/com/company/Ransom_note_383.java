package com.company;

import java.util.HashMap;

public class Ransom_note_383 {
    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        //// create a hashmap to put all magazine characters
        for (int i = 0; i < magazine.length(); i++) {
            hmap.put(magazine.charAt(i), hmap.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        //// create a hashmap to put all magazine characters
        for (int i = 0; i < ransomNote.length(); i++) {
            if (hmap.containsKey(ransomNote.charAt(i))) {
                if (hmap.get(ransomNote.charAt(i)) == 1) hmap.remove(ransomNote.charAt(i));
                else hmap.put(ransomNote.charAt(i), hmap.get(ransomNote.charAt(i)) - 1);
            } else return false;
        }
        return true;

    }
}
