/**
 * 
 */
package com.shrajan.streams;

import java.util.List;
import java.util.function.BinaryOperator;

/**
 * 
 */
public class StreamFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	public static void check(List<Integer> ints) {
		BinaryOperator<Integer> accumulator = Integer::sum;
		
		ints.stream().reduce(accumulator);
	}
	
	
}
