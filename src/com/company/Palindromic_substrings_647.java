package com.company;

public class Palindromic_substrings_647 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countSubstrings(s));
    }

    private static int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;

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
                    count++;
                }
            }
        }
        return count;
    }
}
