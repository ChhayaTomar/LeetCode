package com.company;

public class Count_and_say_38 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        return outputString(n, 1, "1");
    }

    private static String outputString(int n, int i, String s) {
        if (i == n) return s;
        return outputString(n, i + 1, count(s));
    }

    private static String count(String s) {
        int i = 0;
        int j = 0;
        StringBuilder str = new StringBuilder();
        while (i < s.length()) {
            int count = 0;
            while (j < s.length() && (s.charAt(i) == s.charAt(j))) {
                count++;
                j++;
            }
            str.append(String.valueOf(count) + s.charAt(i));
            i = j;
        }
        return String.valueOf(str);
    }


}
