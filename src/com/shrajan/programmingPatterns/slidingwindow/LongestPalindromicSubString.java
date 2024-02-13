package com.shrajan.programmingPatterns.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubString {

	public static void main(String args[]) {
		System.out.println(longestPalSubString("cbbd"));
	}
	
	
	public static String longestPalSubString(String s) {
		
		String oddlength = "",evenLength="";
		int maxLength = Integer.MIN_VALUE;
		String maxLengthPalindromicSubString = "";
		int currentMax=0;
		for(int i=0;i<s.length(); i++) {
			oddlength = expandAroundCenter(s, i, i);
			evenLength = expandAroundCenter(s, i, i+1);
			currentMax = Math.max(oddlength.length(), evenLength.length());
			if(maxLength<currentMax) {
				maxLength = currentMax;
				maxLengthPalindromicSubString = oddlength.length()>evenLength.length()?oddlength:evenLength;
			}
			maxLength = Math.max(maxLength, currentMax);
		}
		
		return maxLengthPalindromicSubString;
		
	}
	
	
	
	public static String expandAroundCenter(String s, int left, int right) {
		while(right<s.length()&& left>=0 && s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		left = left+1;
		right = right-1;
		//System.out.println(s.substring(left, right+1));
		
		return s.substring(left, right+1);
	}
	
	
	
	
	
 	public static String anotherSolution(String s) {
		List<String> allSubStrings = generateSubstrings(s);
		int maxLength = Integer.MIN_VALUE;
		String subString  = "";
		for(String strngs:allSubStrings) {
			if(isPalindrome(strngs)) {
				if(maxLength<strngs.length()) {
					subString = strngs;
					maxLength = strngs.length();
				}
			}
		}
		return subString;
	}
	
	
	
	public static List<String> generateSubstrings(String s) {
        List<String> substrings = new ArrayList<>();

        int start = 0;
        int end = 0;

        while (end < s.length()) {
            substrings.add(s.substring(start, end + 1));
            end++;

            if (end == s.length()) {
                start++;
                end = start;
            }
        }

        return substrings;
    }
	
	
	
	
	
	
	 public static String longestPalindrome(String s) {
		 
		 int maxLength = Integer.MIN_VALUE;
		 
		 int left = 0;
		 int right = 0;
		 String currentSubStr = "";
		 String currentMaxSubStr="";
		 while(right<s.length()) {
			 currentSubStr = s.substring(left, right+1);
			 right++;
			
			 if(isPalindrome(currentSubStr)) {
				 if(maxLength<currentSubStr.length()) {
					 maxLength = currentSubStr.length();
					 currentMaxSubStr = currentSubStr;
				 }
			 }
			 
			 
			 if(right == s.length()) {
				 left++;
				 right = left;
			 }
			 
			
		 }
		
		 return currentMaxSubStr;
	 }
	
	
	 public static boolean isPalindrome(String s) {
		 
		 StringBuilder sb = new StringBuilder(s);
		 return s.equals(sb.reverse().toString());
	 }
	 
	 
	 
}
