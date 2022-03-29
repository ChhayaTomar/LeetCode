package com.company.hard;

public class Median_of_two_sorted_arrays {
    public static void main(String[] args) {
        int[] nums1 = {100001};
        int[] nums2 = {100000};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m + n];
        int j = 0;
        int k = 0;
        int x = (m + n) / 2;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums3[i] = nums2[k++];
            }
        } else if (n == 0) {
            for (int i = 0; i < m; i++) {
                nums3[i] = nums1[j++];
            }
        } else {
            for (int i = 0; i <= x; i++) {
                if (j != nums1.length && k != nums2.length) {
                    nums3[i] = (nums1[j] <= nums2[k]) ? nums1[j++] : nums2[k++];
                } else if (j != nums1.length) nums3[i] = nums1[j++];
                else nums3[i] = nums2[k++];
            }
        }
        double median;
        if (m + n == 1) median = (double) nums3[0];
        else if (((m + n) % 2) == 0) {
            median = (double) (nums3[(m + n) / 2] + nums3[((m + n) / 2) - 1]) / 2;
        } else {
            median = nums3[(m + n) / 2];
        }
        return median;
    }
}
