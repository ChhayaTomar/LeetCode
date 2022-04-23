package com.company.easy;

import java.util.ArrayList;

public class Next_greater_element_I_496 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        //int[] res = nextGreaterElement(nums1, nums2);
        //  System.out.println(Arrays.toString(res));

        ArrayList<Integer> alist=new ArrayList<>();
        alist.add(1);
        alist.add(2);
        Object[] arr= alist.toArray();
        System.out.println(arr[1]);

    }


//    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int n1 = nums1.length;
//        int n2 = nums2.length;
//        int n = (n1 < n2) ? n1 : n2;
//
//    }
}
