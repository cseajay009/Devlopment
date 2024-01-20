package com.shrajan.leetcode.blind75;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,3,45,9}));

	}

	
public static  boolean containsDuplicate(int[] nums) {
        
	Set<Integer> set = new HashSet<Integer>();
	for(Integer ints:nums) {
		if(set.contains(ints))return true;
		else set.add(ints);
	}
	
	
	
	return false;
    }
}
