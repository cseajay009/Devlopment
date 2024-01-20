package com.shrajan.regex;

public class StringSum {

	public static void main(String[] args) {
		
		System.out.println(addString("11111212221212121212121212121212121122121212121212121212121", "23"));

	}
	
	
	
	
	
	public static String addString(String one, String two) {
		
		
		// Compare two Strings and ensure one is holding value with higher characters if it does not swap
		if(two.length()>one.length()) {
			String temp = one;
			one = two;
			two =temp;
		}
		
		// Fill the two with equal number of zeros
		StringBuilder result = new StringBuilder();
		two = String.format("%"+one.length()+"s", two).replace(' ', '0');
		int carry = 0;
		for(int i = one.length()-1; i>=0; i--) {
			int digitSum = Character.getNumericValue(one.charAt(i))+Character.getNumericValue(two.charAt(i))+carry;
			carry = digitSum/10;
			result.insert(0, digitSum%10);
		}
		
		if(carry>0) {
			result.insert(0, carry);
		}
		
		// loop through higher number and keep on adding one number at a time using Character.NumeriValue method
		
		// save carry to be used in the next iteration
		
		
		return formatNumericString(result.toString());
	}
	
	public static String formatNumericString(String toFormat) {
		
		return toFormat.replaceAll("(?<=\\d)(?=(\\d{3})+(?!\\d))", ",");
	}

}
