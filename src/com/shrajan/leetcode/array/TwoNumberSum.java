package com.shrajan.leetcode.array;

import java.util.Arrays;

public class TwoNumberSum {

	public static void main(String[] args) {
		
		printResult(twoSum(new int[] {2,7,11,15},9));
	//	printResult(twoSum(new int[] {3,2,4},6));
	//	printResult(twoSum(new int[] {3,3},6));

	}

	public static int[] twoSum(int[] arr, int sum) {
		int [] toReturn =  new int[] {0,0};
		
		int left = 0 ;
		int right = arr.length-1;
		while(left<arr.length) {
			System.out.println(arr[left]+" "+ arr[right]);
			
			if(arr[left]+arr[right]==sum) {
				return new int[] {arr[left],arr[right]};
			}
			left++;
			right--;
		}
		
	
	
	
	    return toReturn;
	}
	
	public static void printResult(int []arr) {
		for(Integer ints: arr) {
			System.out.print(ints);
		}
	}
	
}
