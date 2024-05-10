package ru.filin.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;

        mergeSortedArray.merge(nums1, m, nums2, n);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + ", ");
        }
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1, "actual: " + Stream.of(nums1).map(String::valueOf).collect(Collectors.joining(", ")));
    }


    @Test
    void merge_2() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int m = 1;
        int n = 0;

        mergeSortedArray.merge(nums1, m, nums2, n);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + ", ");
        }
        assertArrayEquals(new int[]{1}, nums1, "actual: " + Stream.of(nums1).map(String::valueOf).collect(Collectors.joining(", ")));
    }

    @Test
    void merge_3() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int m = 0;
        int n = 1;

        mergeSortedArray.merge(nums1, m, nums2, n);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + ", ");
        }
        assertArrayEquals(new int[]{1}, nums1, "actual: " + Stream.of(nums1).map(String::valueOf).collect(Collectors.joining(", ")));
    }
}