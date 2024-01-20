package com.shrajan.leetcode.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ETwoNumberSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSumG(new int[] {3,3}, 6)));

	}
	
	// 6ms
	 public static int[] twoSum(int[] nums, int target) { 
		 // Populate Collection to Hold Values
	        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

	        for(int i=0; i<nums.length;i++){
	            if(map.get(nums[i])==null){
	                map.put(nums[i],i);
	            }
	        }
	     
	        for(int i=0; i<nums.length; i++){
	         if(map.get(target-nums[i])!=null && ((target-nums[i])!=nums[i])|| 
	        		 (map.get(target-nums[i])!=null &&map.get(target-nums[i])!=i)){
	             return new int[]{map.get(target-nums[i]),i};
	         }

	        }

	      return new int[]{0,0};
	 }
	 // 1ms
	 public static int[] twoSumG(int[] nums, int target) {
     	HashMap<Integer, Integer> hm =  new HashMap<Integer, Integer>();
		int difference =0;
		for(int i=0; i<nums.length;i++) {
			difference = target-nums[i];
			 if(hm.containsKey(difference)) {
				 return new int[] {hm.get(difference),i};
			 }else {
				 hm.put(nums[i], i);
			 }
			
			
			
		}
		
		return new int[] {};
 }

}
