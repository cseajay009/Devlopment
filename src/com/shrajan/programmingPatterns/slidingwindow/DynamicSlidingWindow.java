package com.shrajan.programmingPatterns.slidingwindow;

public class DynamicSlidingWindow {

	public static void main(String[] args) {
		
		System.out.println(minLengthSubArray(new int[] {3,1,5,2,4,1,7}, 7)==1?true:false);
		System.out.println(minLengthSubArray(new int[] {2,3,1,2,4,3}, 7)==2?true:false);
		System.out.println(minLengthSubArray(new int[] {1,4,4}, 4)==1?true:false);
		System.out.println(minLengthSubArray(new int[] {1,1,1,1,1,1,1,1}, 11)==0?true:false);

	}
	
	
	
	public static int minLengthSubArray(int[] intArray, int target) {
		int minLength = Integer.MAX_VALUE;
		
		
		int left = 0;
		int right=0;
		int currentSum=0;
     	while(right<intArray.length ){
     		currentSum+=intArray[right];
			
			while(currentSum>=target) {
				
				minLength = Math.min(minLength, right-left+1);
				currentSum-=intArray[left];
				left++; // Shrink the window
			}
			right++;
			
		}
		
		
		return minLength==Integer.MAX_VALUE?0:minLength;
	}
	
	
	

}
