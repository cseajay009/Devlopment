package com.shrajan.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveLookbehindExample {

	public static void main(String[] args) {
		    String input = "1234567890";
	        String regex = "(?<=\\d)(?=(\\d{3})+(?!\\d))";
	        //(?<=\\d)(?=(\\d{3})+(?!\\d))
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        
                 System.out.println(input.replaceAll(regex, ","));
                 
	        while (matcher.find()) {
	            System.out.println("Match found at index: " + matcher.start());
	        }

	}

}
//  (?<=\\d)(?=(\\d{3})+(?!\\d))