package com.company.medium;

import java.util.Arrays;


public class Two_sum_II_input_array_is_sorted_167 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            } else if (numbers[i] + numbers[j] < target) i++;
            else j--;
        }
        return res;
    }
}
