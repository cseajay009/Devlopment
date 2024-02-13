package com.shrajan.leetcode.string;

public class RemoveDuplicatesTwoPointer {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};

        int lengthAfterRemoval = removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + lengthAfterRemoval);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < lengthAfterRemoval; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
