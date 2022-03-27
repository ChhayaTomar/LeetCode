package com.company.easy;

public class Counting_words_with_A_Given_prefix {
    public static int prefixCount(String[] words, String pref) {
        int count=0;
        int p=pref.length();
        for(String s : words){
            if(s.length()>=p){
                String s1=s.substring(0,p);
                if(pref.equals(s1)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words={"pay","attention","practice","attend"};
        String pref="code";
        System.out.println(prefixCount(words,pref));
    }
}
