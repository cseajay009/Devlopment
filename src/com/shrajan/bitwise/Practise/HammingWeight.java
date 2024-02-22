package com.shrajan.bitwise.Practise;

public class HammingWeight {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(Exp.padZeros(n));
		notionofShift(n);

	}
	
	/**
	 * This utilizes the fact that 1,1 is 1 for & gate
	 * so starting from the right most bit it keep's adding to each bit and check 
	 * if the result is non 0 which means that it is 1 at that position
	 * @param n
	 * @return
	 */
	public static int hammingWeight(int n) {
		int count=0;
		
		for(int i=0; i<32; i++) {
			int mask = 1<<i;
			if((n&mask)!=0)count++;
		}
		
		
		return count;
	}
	
	
	/*
	 * As we can see 1 keeps shifting to the left at every iteration
	 */
	public static void notionofShift(int n) {
		
		
		
		for(int i=0; i<32; i++) {
			int var = 1<<i;
			System.out.println(Exp.padZeros(var));
		}
		
		
	}

}
