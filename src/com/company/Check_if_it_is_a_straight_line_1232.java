package com.company;

import java.util.Arrays;

public class Check_if_it_is_a_straight_line_1232 {
    public static void main(String[] args) {
        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

        System.out.println(checkStraightLine(coordinates));
    }

    private static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates[0][0] == coordinates[1][0]) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != coordinates[0][0]) return false;
            }
            return true;
        }
        if (coordinates[0][1] == coordinates[1][1]) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][1] != coordinates[0][1]) return false;
            }
            return true;
        }
        double slope = (coordinates[0][1] - coordinates[1][1]) / ((double) coordinates[0][0] - coordinates[1][0]);
        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[i][0] == coordinates[0][0]) return false;
            double currSlope = (coordinates[0][1] - coordinates[i][1]) / ((double) coordinates[0][0] - coordinates[i][0]);
            if (slope != currSlope) return false;
        }
        return true;
    }
}
