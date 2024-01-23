package com.shrajan.programmingPatterns.slidingwindow;

public class MaxSubArrayWithoutSize {

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            // If the current sum becomes negative, start a new subarray
            currentSum = Math.max(num, currentSum + num);

            // Update the maximum sum encountered so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result); // Output: 6
    }
}
