package com.shrajan.programmingPatterns.slidingwindow;

public class SlidingWindow {

	public static void main(String[] args) {
		System.out.println(maxSum(new int[] {1, 4, 2, 10, 2, 3, 1, 0, 20}, 4));

	}

	
	
	public static int maxSum(int[] arr , int k) {
		int maxSum = 0;
		
		
		int currentSum = 0,windowSum = 0;
		for(int i=0; i<k;i++) {
			currentSum+=arr[i];
		}
		
		windowSum = currentSum;
		
		for(int i=k; i<arr.length; i++) {
			windowSum = windowSum+arr[i]-arr[i-k];
			maxSum = Math.max(maxSum, windowSum);
		}
		
		
		return maxSum;
	}
}
