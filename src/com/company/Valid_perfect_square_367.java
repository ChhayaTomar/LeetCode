package com.company;

public class Valid_perfect_square_367 {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPerfectSquare(n));
    }
    public static boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int start=1;
        int end=num;

        while(start<=end){
            long mid=(start+end)/2;

            if(mid*mid==num) return true;
            else if(mid*mid < num) start=(int)(mid+1);
            else end=(int)(mid-1);
        }
        return false;
    }
}
