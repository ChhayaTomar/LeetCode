package com.company.easy;


import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int m=arr.length;
//        int n=arr[0].length;
        List<Integer> list = spiralOrder(arr);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int x = 0;
        int y = 0;

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if((i==0) || (j==0) || (i==m-1) || (j==n-1)){
//                    list.add(matrix[i][j]);
//                }
//            }
//        }
        if (m > 0 && n > 0) {
            for (int i = y; i < n; i++) {
                list.add(matrix[x][i]);
            }
            for (int i = x + 1; i < m; i++) {
                list.add(matrix[i][n - 1]);
            }
            for (int i = n - 1; i <= y; i--) {
                list.add(matrix[m - 1][i]);
            }
            for (int i = m - 2; i <= x; i++) {
                list.add(matrix[i][y]);
            }
            x++;
            y++;
            m--;
            n--;
        }
        return list;
    }
}
