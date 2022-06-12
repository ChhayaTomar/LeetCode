package com.company;

public class Palindrome_number_9 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int temp=x;
        int reversedNum=0;
        int rem=0;

        while(temp>0){
            rem=temp%10;
            reversedNum=(reversedNum*10)+rem;
            temp=temp/10;
        }
        if(reversedNum==x) return true;
        return false;
//        String str = Integer.toString(x);
//        int start = 0;
//        int end = str.length() - 1;
//
//        while (start < end) {
//            if ((str.charAt(start)) != (str.charAt(end))) return false;
//            start++;
//            end--;
//        }
//        return true;
    }
}
