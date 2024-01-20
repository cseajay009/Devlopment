package com.shrajan.leetcode.blind75;

public class MinInRotatedSortedSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Implement Using Binary Search
    public static int findMin(int[] nums) {
        
	return 0;
    }
    
    
    
    /*
     * 
     * 
[1,2,3,4,5,6,7,8,9]

rotation 1

[9,1,2,3,4,5,6,7,8]

rotation 2

[8,9,1,2,3,4,5,6,7]

rotation 3

[7,8,9,1,2,3,4,5,6]

minimum value

identify n vs n-1 and find out if it is an increasing sequence or decreasing sequence

When we are comparing elements 8 and 7 we will see increasing sequence do not do anything

whenever we find situation where n<n-1 that will be the minimum value in a positive array

[1,2,3,4,5]

rotation 1
[5,1,2,3,4]
rotation 2
[4,5,1,2,3]
rotation 3
[3,4,5,1,2]

list does not have any duplicate values

rotation can be from 0 .. length(array)
     */

}
