package com.company.easy;

import java.util.Arrays;

public class Check_if_it_is_a_straight_line_1232 {
    public static void main(String[] args) {
        int[][] coordinates={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};

        System.out.println(checkStraightLine(coordinates));
    }
//     1 2
   //    2 3
    //
    private static boolean checkStraightLine(int[][] coordinates) {
        int r=coordinates.length;
        int x=coordinates[1][0]-coordinates[0][0];
        int y=coordinates[1][1]-coordinates[0][1];
        for (int i = 2; i < r; i++) {
            int x1=coordinates[i][0]-coordinates[i-1][0];
            int y1=coordinates[i][1]-coordinates[i-1][1];
            if(x1!=x || y1!=y) return false;
        }
        return true;
    }
}
