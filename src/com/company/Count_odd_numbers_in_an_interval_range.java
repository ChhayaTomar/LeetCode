package com.company;

import java.util.Scanner;

public class Count_odd_numbers_in_an_interval_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        System.out.println(countOdds(low, high));
        ;
    }

    private static int countOdds(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0) return ((high - low) / 2);
        else return (((high - low) / 2) + 1);
    }
}
