package com.company.easy;

public class Check_if_one_string_swap_can_make_strings_equal_1790 {
    public static void main(String[] args) {
        String s1="bank";
        String s2="kanb";
        System.out.println(areAlmostEqual(s1,s2));
    }

    private static boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        char s1c1='a', s1c2='z';
        char s2c1='a', s2c2='z';
        for(int i=0;i<s1.length();i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count += 1;
                if(count==1){
                    s1c1=s1.charAt(i);
                    s2c1=s2.charAt(i);
                }
                if(count==2){
                    s1c2=s1.charAt(i);
                    s2c2=s2.charAt(i);
                }
                if(count>2) break;
            }
        }
        if(count==0) return true;
        if(count==2 && s1c1==s2c2 && s1c2==s2c1) return true;

        return false;
    }
}
