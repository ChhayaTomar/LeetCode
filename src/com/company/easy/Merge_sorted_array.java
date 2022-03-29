package com.company.easy;

import java.util.Arrays;

public class Merge_sorted_array {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[m + n];

        while (i < m && j < n) {
            ans[k] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
            k++;
        }
        while (i < m) {
            ans[k] = nums1[i++];
            k++;
        }
        while (j < n) {
            ans[k] = nums2[j++];
            k++;
        }

        for (int x = 0; x < ans.length; x++) {
            nums1[x] = ans[x];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
