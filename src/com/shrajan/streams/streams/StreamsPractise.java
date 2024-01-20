package com.shrajan.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamsPractise {

	public static void main(String[] args) {
		Integer[] ints = new Integer[] {1,2,3,4,5,6,7,8,9,100,98,200,49};
		String[] strngs = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q"};

		List<Integer> integers = new ArrayList<Integer>(Arrays.asList(ints));
		List<String> strn = new ArrayList<String>(Arrays.asList(strngs));
		
		checkMapFunction(integers, strn);
	}

	
	
	
	public static void checkMapFunction(List<Integer> ints, List<String> strngs ) {
		
		List<Integer> lst = ints.stream().filter(c-> c.intValue()>8).map(c-> c.intValue()).collect(Collectors.toList());
		
		
		
		OptionalDouble avg = ints.stream().mapToInt(c->c).average();
		int sm = ints.stream().mapToInt(c->c).sum();
		
		System.out.println(avg.getAsDouble());
		System.out.println(sm);
		
		OptionalInt intv = ints.stream().mapToInt(c->c).max();
		System.out.println(intv.getAsInt());
		OptionalInt intmin = ints.stream().mapToInt(c->c).min();
		System.out.println(intmin.getAsInt());
		
		// Sum of all numbers greater than 5
		
		System.out.println((ints.stream().filter(c-> c.intValue()>5).mapToInt(c->c).average()).getAsDouble());
	}
	
	
	
	
	
}
