package com.shrajan.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormatterPractise {

	public static void main(String[] args) {
		//System.out.println(matchPattern("[a-zA-Z]","Gfg"));
		
		//attern.matches("[a-zA-Z]", "Gfg"));
		
		
		
		// Positive look behind assertion
		//(?<=\\d)(?=(\\d{3})+(?!\\d))
		
		//(?=   is Look ahead assertion
		// \\d{3} denotes 3 continuous digits
		
		//?!  is negative look ahead assertion (is not present at the current position in the string without including it in the match.)
		//\\d
		
		System.out.println(matchPattern("(?<=\\d)", "4334343434433434"));

	}
	public static void testPattern(String pattern, String testString) {

	    Pattern patternObj = Pattern.compile(pattern);
	    Matcher matcher = patternObj.matcher(testString);
	  
	   
	    while(matcher.find()) {
	    	System.out.println(matcher.start());
	    }
	    
	    
	}
	
	
	
	public static boolean matchPattern(String pattern, String testString) {

	    Pattern patternObj = Pattern.compile(pattern);
	    Matcher matcher = patternObj.matcher(testString);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      return true;
	    } else {
	      return false;
	    }
	  
	}
}
/*
 * Basic Components:
Literal Characters:

Ordinary characters in a regex pattern match themselves. For example, the pattern "abc" will match the string "abc" in the text.
Metacharacters:

Special characters with reserved meanings in regex. Examples include ^, $, ., *, +, ?, |, (), [], {}, etc.

Quantifiers:

* (Zero or more): Matches zero or more occurrences of the preceding character or group.
+ (One or more): Matches one or more occurrences of the preceding character or group.
? (Zero or one): Matches zero or one occurrence of the preceding character or group.
{n} (Exactly n): Matches exactly n occurrences of the preceding character or group.
{n,} (At least n): Matches n or more occurrences of the preceding character or group.
{n,m} (Between n and m): Matches between n and m occurrences of the preceding character or group.


Character Classes:
[]: Defines a character class. For example, [aeiou] matches any vowel.
[^]: Negates a character class. For example, [^0-9] matches any non-digit.
Anchors:
^ (Caret): Matches the start of a line.
$ (Dollar): Matches the end of a line.
Groups and Capturing:
() (Parentheses): Groups characters together. Also used for capturing groups.
(?:...) (Non-capturing group): Groups without capturing.
Escape Characters:
\: Escapes a metacharacter, allowing it to be treated as a literal character. For example, \\ matches a backslash.
Examples:
^([A-Za-z]+) \d+$: Matches a line that starts with one or more letters, followed by a space, and ends with one or more digits.
\b\d{3}-\d{2}-\d{4}\b: Matches a U.S. Social Security Number in the text.
 */