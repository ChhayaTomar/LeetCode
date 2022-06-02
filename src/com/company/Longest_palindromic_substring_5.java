package com.company;

public class Longest_palindromic_substring_5 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(countSubstrings(s));
    }
    private static String countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        String str="";

        for (int gap = 0; gap < s.length(); gap++) {
            for (int i = 0, j = gap; j < s.length(); i++, j++) {
                if (gap == 0) {
                    dp[i][j] = true;
                } else if (gap == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }
                }

                if(dp[i][j]){
                    str=s.substring(i,j+1);
                }
            }
        }
        return str;
    }
}
