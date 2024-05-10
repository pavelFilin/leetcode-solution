package ru.filin.arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n--;
        m--;

        while (n >= 0 || m >= 0) {

            if (m < 0) {
                nums1[n + m + 1] = nums2[n];
                n--;
            } else if (n < 0) {
                nums1[n + m + 1] = nums1[m];
                m--;
            } else {
                if (nums2[n] > nums1[m]) {
                    nums1[n + m + 1] = nums2[n];
                    n--;
                } else {
                    nums1[n + m + 1] = nums1[m];
                    m--;
                }
            }
        }
    }
}
