package com.company.easy;

public class Find_smallest_letter_greater_than_target {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    //    public static char nextGreatestLetter(char[] letters, char target){
//        int t=(int) target;
//        int min=Integer.MIN_VALUE;
//        for (char c:letters) {
//            min=Math.min(min, t-(int)c);
//        }
//        return ((char)min);
//    }
    public static char nextGreatestLetter(char[] letters, char target) {
        char smallest = 'z';
        boolean flag = false;
        for (char c : letters) {
            if (c > target && c < smallest) {
                smallest = c;
                flag = true;
            }
        }
        return smallest;
    }
}
