package ru.filin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates() {
        int[] nums = {1,1,2};
        int[] expectedNums = {1,2};

        int k = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(expectedNums.length, k);

        int[] ints = Arrays.copyOfRange(nums, 0, k);
        Assertions.assertArrayEquals(expectedNums, ints);

    }

    @Test
    void removeDuplicates_2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4};

        int k = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(expectedNums.length, k);

        int[] ints = Arrays.copyOfRange(nums, 0, k);
        Assertions.assertArrayEquals(expectedNums, ints);
    }

    @Test
    void removeDuplicates_3() {
        int[] nums = {1,2};
        int[] expectedNums = {1,2};

        int k = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(expectedNums.length, k);

        int[] ints = Arrays.copyOfRange(nums, 0, k);
        Assertions.assertArrayEquals(expectedNums, ints);

    }

}