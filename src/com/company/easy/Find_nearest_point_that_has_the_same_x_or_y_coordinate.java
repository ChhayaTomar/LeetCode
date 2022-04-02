package com.company.easy;

public class Find_nearest_point_that_has_the_same_x_or_y_coordinate {
    public static void main(String[] args) {
        int[][] points={{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int x=3, y=4;
        System.out.println(nearestValidPoint(x,y,points));
    }

    private static int nearestValidPoint(int x, int y, int[][] points) {
        int r=points.length;
        int minManhattDistance=Integer.MAX_VALUE;
        int index=-1;
        for (int i = 0; i < r; i++) {
            int x1=points[i][0];
            int y1=points[i][1];
            if(x1==x || y1==y){
                int dis=Math.abs(x-x1) + Math.abs(y-y1);
                if(minManhattDistance> dis) {
                    minManhattDistance= dis;
                    index=i;
                }
            }
        }
        return index;
    }
}
