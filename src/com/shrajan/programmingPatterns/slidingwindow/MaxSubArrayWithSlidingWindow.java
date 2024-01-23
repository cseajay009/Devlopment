package com.shrajan.programmingPatterns.slidingwindow;

public class MaxSubArrayWithSlidingWindow {

    public static int[] maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int currentStart = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the current sum becomes negative, reset the window
            if (currentSum <= 0) {
                currentSum = nums[i];
                currentStart = i;
            } else {
                // Extend the window by including the current element
                currentSum += nums[i];
            }

            // Check if contracting the window is beneficial
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = currentStart;
                end = i;
            }

            // Contract the window if current element is negative
            if (nums[i] < 0 && currentSum < nums[i]) {
                currentSum = nums[i];
                currentStart = i;
            }
        }

        // Build and return the subarray with the maximum sum
        int[] resultSubArray = new int[end - start + 1];
        System.arraycopy(nums, start, resultSubArray, 0, resultSubArray.length);

        return resultSubArray;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,0,0,0,0,0,5,2};
        int[] resultSubArray = maxSubArray(nums);

        System.out.print("Maximum Subarray: [");
        for (int i = 0; i < resultSubArray.length; i++) {
            System.out.print(resultSubArray[i]);
            if (i < resultSubArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Output: [4, -1, 2, 1]
    }
}

