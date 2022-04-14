package com.company.easy;



public class Intersection_of_two_arrays_II_350 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};

        int[] res=intersect(nums1,nums2);
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

        int n=Math.max(n1,n2);
        return nums1;
    }
}
