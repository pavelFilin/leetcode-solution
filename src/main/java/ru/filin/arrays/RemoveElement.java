package ru.filin.arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int cursor = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[cursor++] = nums[i];
            }
        }
        return cursor;
    }
}
