package ru.filin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;

class RemoveElementTest {

    RemoveElement removeElement = new RemoveElement();

    @Test
    void removeElement() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int[] expectedNums = {2,2};
        // It is sorted with no values equaling val.

        int k = removeElement.removeElement(nums, val);

        Assertions.assertEquals(expectedNums.length, k);
        sort(nums, 0, k);
        for (int i = 0; i < 2; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void removeElement2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2; // Value to remove
        int[] expectedNums = {0,1,4,0,3}; //


        int k = removeElement.removeElement(nums, val);

        Assertions.assertEquals(expectedNums.length, k);
        sort(nums, 0, k);
        sort(expectedNums);
        for (int i = 0; i < 2; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

}