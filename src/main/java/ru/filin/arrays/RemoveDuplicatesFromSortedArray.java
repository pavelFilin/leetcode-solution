package ru.filin.arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
//        if (nums.length < 2 || nums.length == 2 && nums[0] != nums[1]) {
//            return nums.length;
//        }
        if (nums.length < 2) {
            return nums.length;
        }
        int selected = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != selected) {
                nums[index++] = nums[i];
                selected = nums[i];
            }
        }
        return index;
    }

}
