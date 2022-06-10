package com.company;

public class Longest_palindromic_subsequence_516 {
    public static void main(String[] args) {
        String s="bbbab";
        System.out.println(longestPalindromeSubseq(s));
    }
    public static int longestPalindromeSubseq(String s) {
        String s1="";
        for (int i = s.length()-1; i >=0; i--) {
            s1+=s.charAt(i);
        }
//        System.out.println(s);
//        System.out.println(s1);

        int[][] dp=new int[s.length()+1][s1.length()+1];

        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s.length()][s1.length()];
    }
}
