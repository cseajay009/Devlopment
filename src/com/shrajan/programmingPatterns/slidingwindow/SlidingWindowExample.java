package com.shrajan.programmingPatterns.slidingwindow;

public class SlidingWindowExample {

	public static int maxSubarraySum(int[] nums, int k) {
        int windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;  // 7

        // Slide the window through the array
        for (int i = k; i < nums.length; i++) {
            // Subtract the element leaving the window and
        	//add the new element entering the window
        	
        	// 7-(nums[3-3])+10  7-1+10 = 16 
        	// 16-(nums[4-3])+2  16-4+2 = 14
        	// 16-(nums[5-3])+3  16-2+3 = 17 
            // 17-(nums[6-3])+1  17-10+1 = 8
        	// 17-(nums[7-3])+0  17-2+0 = 15
        	// 17-(nums[8-3])+20 17-3+20 = 35 ---Max
        	       
        	windowSum = windowSum - nums[i - k] + nums[i];

            // Update the maximum sum if the current window sum is greater
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 3;

        int result = maxSubarraySum(nums, k);
        System.out.println(result);  // Output: 29
    }

}
