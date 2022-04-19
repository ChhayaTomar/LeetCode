package com.company.easy;

public class Detect_capital_520 {
    public static void main(String[] args) {
        String word="Leetcode";
        System.out.println(detectCapitalUse(word));
    }

    private static boolean detectCapitalUse(String word) {
        int n = word.length();
        if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            if (word.charAt(1) >= 65 && word.charAt(1) <= 90) {
                for (int i = 2; i < n; i++) {
                    if (!(word.charAt(i) >= 65 && word.charAt(i) <= 90)) {
                        return false;
                    }
                }
            } else {
                for (int i = 2; i < n; i++) {
                    if (!(word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 1; i < n; i++) {
                if (!(word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
                    return false;
                }
            }
        }
        return true;
    }
}
