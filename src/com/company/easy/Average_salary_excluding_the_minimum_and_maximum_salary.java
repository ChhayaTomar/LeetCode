package com.company.easy;

import java.util.Arrays;

public class Average_salary_excluding_the_minimum_and_maximum_salary {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary));
    }

    private static double average(int[] salary) {
        int n = salary.length;
        int max = salary[0];
        int min = salary[0];
        double totalSalary = salary[0];
        for (int i = 1; i < n; i++) {
            totalSalary += salary[i];
            if (salary[i] > max) max = salary[i];
            if (salary[i] < min) min = salary[i];
        }
        totalSalary = totalSalary - max - min;
        return (totalSalary / (n - 2));
    }
}
