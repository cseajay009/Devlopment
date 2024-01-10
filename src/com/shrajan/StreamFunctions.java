/**
 * 
 */
package com.shrajan.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */
public class StreamFunctions {

	/**
	 * @param args
	 */
	
	private static List<Employee> empls;
	
	public static List<Employee> getEmployee(){
		empls = new ArrayList<Employee>();
		empls.add(new Employee(1, "Ajay", 400000));
		
		empls.add(new Employee(2, "Ashish", 300000));
		empls.add(new Employee(3, "Suresh", 200000));
		empls.add(new Employee(4, "Jayesh", 100000));
		empls.add(new Employee(5, "Larl", 4000000));
		
		
		
		
		return empls;
		
	}
	
	
	public static void main(String[] args) {
		Integer[] ints=	new Integer[]{20,30,40,50,60,70,70,60,40,30,20};
		String[] strngs = new String[] {"A","B","AC","D","E","F","AG","H","I","J","K"};
		
		 getEmployee();
		
		 System.out.println(calculateAverage(Arrays.asList(ints)));
		 System.out.println(getConvertedList(Arrays.asList(strngs)));
		 System.out.println(calculateSum(Arrays.asList(ints)));
		 System.out.println(Arrays.asList(ints));
		 System.out.println(removeDuplicates(Arrays.asList(ints)));
		 System.out.println(countStartsWith(Arrays.asList(strngs)));
		  

	}
	
	
	//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.
	public static int countStartsWith(List<String> stngs) {
		return (int) stngs.stream().filter(c->c.startsWith("A")).count();
	}
	
	
	
	//4. Write a Java program to remove all duplicate elements from a list using streams.
	public static List<Integer> removeDuplicates(List<Integer> lst){
		return lst.stream().distinct().collect(Collectors.toList());
	}
	
	
	//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
	public static int calculateSum(List<Integer> ints) {
		return ints.stream().filter(nums-> nums%2==0).mapToInt(Integer::intValue).sum();
	} 
	
	
    //2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
	public static List<String> getConvertedList(List<String> strngs){
		return strngs.stream().map(String::toLowerCase).collect(Collectors.toList());
	}
	
	
	
	//1. Write a Java program to calculate the average of a list of integers using streams.
	public static double calculateAverage(List<Integer> ints) {
		return ints.stream().mapToInt(c->c).average().getAsDouble();
	}
	
	
	public static void checkMap(List<Integer>ints, List<String>strngs) {
		
		
		
		Stream strngStream = strngs.stream();
		List<Integer> numbers = ints.stream().map(Integer::valueOf).collect(Collectors.toList());
              
		
		
	}
	
	
	
	
	
	
}
