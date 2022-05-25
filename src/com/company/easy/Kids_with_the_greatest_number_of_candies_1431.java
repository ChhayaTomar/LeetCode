package com.company.easy;

import java.util.ArrayList;
import java.util.List;

public class Kids_with_the_greatest_number_of_candies_1431 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        int n = candies.length;
        List<Boolean> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (candies[i] > max) max = candies[i];
        }
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}
