package com.company.easy;

public class Check_if_one_string_swap_can_make_strings_equal_1790 {
    public static void main(String[] args) {
        String s1="bank";
        String s2="kanb";
        System.out.println(areAlmostEqual(s1,s2));
    }

    private static boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int c1=0,c2=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)) {
                count += 1;
                if(count==1) {
                    c1 = i;
                }
                if(count==2){
                    c2=i;
                }
            }
        }
        //swapping ith and jth char in s1
        if(count==2){
//            char temp=s1.charAt(c1);
//            s1.charAt(c1)=s1.charAt(c2);
//            s1.charAt(c2)=temp;
            int temp=c1;
            c1=c2;
            c2=temp;
        }
        if(count==2 || count==0) return true;
        else return false;
    }
}
