package com.company;

public class Convert_1D_to_2D_Array {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2, n = 2; //m=no. of rows, n=number of columns
        int[][] finalArr = construct2DArray(original, m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(finalArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int k = 0;
        int[][] newArr = new int[m][n];
        if (m * n == original.length) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    newArr[i][j] = original[k];
                    k++;
                }
            }
            return newArr;
        }
        return new int[0][0];
    }
}
