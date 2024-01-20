package com.shrajan.leetcode.blind75;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		System.out.println(maxProductTest(new int[] {2,0,3,-2,4}));

	}

	
	/*
	 * Important to note here that since we have +ve and -ve numbers in the array or we might have it
	 * min can become maximum and maximum can become minimum anytime
	 * Hence we have to find max of min and max
	 * 
	 * And this is where confusion lies, So just to conclude on this 
	 * 
	 * jist is we are checking on each iteration Is this number going to contribute to a higher product or not
	 * by checking min and max with lastProduct and the number itself
	 */
	// My Version Easy to ReCall
	public static int  maxProductTest(int[] nums) {
		int result=0;
		
		int minProduct=nums[0];//2
		int maxProduct = nums[0];//2
		result=nums[0];//2
		for(int i=1;i<nums.length;i++) {
		
			if(nums[i]<0) {
				int temp = minProduct;    // 0
				minProduct =  maxProduct; // 3
				maxProduct = temp;    // 0
			}
			//  0*2,0 => 0 .. 3*0, 3 => 0 .. -2*0, -2 => -2  .. 4*-2,4 => -8
			minProduct = Math.min(nums[i]*minProduct, nums[i]);  
			//  2*0, 0 => 0 .. 0*3,3 => 3 .. 0*-2, -2 =>0 ..  4*0, 4 => 4
			maxProduct = Math.max(maxProduct*nums[i], nums[i]); 
			// 0,0 => 0 .. 0,3 => 3  ... -2,0 => 0  .. -8,4 => 4
			result = Math.max(result, maxProduct);
			
		}
		
		
		
		
		return result;
	}	
	
	public static int maxProduct(int[]nums) {
		   if (nums == null || nums.length == 0) {
	            return 0;
	        }

	        int maxProduct = nums[0];
	        int minProduct = nums[0];
	        int result = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            // Swap maxProduct and minProduct if the current number is negative
	            if (nums[i] < 0) {
	                int temp = maxProduct;
	                maxProduct = minProduct;
	                minProduct = temp;
	            }

	            // Update maxProduct and minProduct for the current index
	            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
	            minProduct = Math.min(nums[i], minProduct * nums[i]);

	            // Update the result with the maximum product so far
	            result = Math.max(result, maxProduct);
	        }

	        return result;
	}
}
