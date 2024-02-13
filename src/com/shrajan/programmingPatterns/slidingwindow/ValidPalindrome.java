package com.shrajan.programmingPatterns.slidingwindow;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("ab_a"));

	}
    public static boolean isPalindrome(String s) {
        
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    s = s.toLowerCase();
    
    StringBuilder sb = new StringBuilder(s);
    
    return s.equals(sb.reverse().toString());
    
    	
    }
}
