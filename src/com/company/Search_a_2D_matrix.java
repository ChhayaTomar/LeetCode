package com.company;

public class Search_a_2D_matrix {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=0;
        System.out.println(searchMatrix(matrix,target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;

        int low=0;
        int high=rows-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid][0] == target) return true;
            else if(matrix[mid][0] < target && matrix[mid][columns-1]>= target){
                return searchInRow(matrix,mid,target,columns);
            }
            else if(matrix[mid][0]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    public static boolean searchInRow(int[][] matrix,int i, int target, int columns){
        int low=1;
        int high=columns-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[i][mid]==target) return true;
            else if(matrix[i][mid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}
