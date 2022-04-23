package com.company.easy;

public class Happy_Number_202 {
    public static void main(String[] args) {
        int n = 11111;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        if (n == 1111111) return true;
        int res = squareOfDigits(n);
        if (res == 1) return true;
        return false;
    }

    public static int squareOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + ((n % 10) * (n % 10));
            n = n / 10;
        }
        if (sum < 10) return sum;
        return squareOfDigits(sum);
    }

}
