package com.company;

public class Peak_Index_In_A_Mountain_Arraay {
    public static int peakIndex(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int i = (low + high) / 2;
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) return i;
            if (arr[i + 1] < arr[i]) high = i;
            else low = i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndex(arr));

    }

}
