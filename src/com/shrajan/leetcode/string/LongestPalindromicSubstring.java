package com.shrajan.leetcode.string;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		long millisbefore = System.currentTimeMillis();
		System.out.println(longestPalindrome("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"));
        System.out.println(System.currentTimeMillis()-millisbefore);
	}
	  // TC O(n^2) SC 0(1)
	 public static String longestPalindrome(String s) {
         if (s == null || s.length() < 1) return "";
         int start = 0, end = 0;
         for (int i = 0; i < s.length(); i++) {
             int len1 = expandAroundCenter(s, i, i);
             int len2 = expandAroundCenter(s, i, i + 1);
             int len = Math.max(len1, len2);
             if (len > end - start) {
                 start = i - (len - 1) / 2;
                 end = i + len / 2;
             }
         }
         return s.substring(start, end + 1);
     }

     private static int expandAroundCenter(String s, int left, int right) {
         int L = left, R = right;
         while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
             L--;
             R++;
         }
         return R - L - 1;
     }

	// TLE Error :):(
	public static String longestPalindromicSubString(String str) {
		int maxLength = 0;
		
		int start = 0 ;
		int end = 0 ;
		String subString ="";
		String palindromic="";
		while(end<str.length()) {
			subString = str.substring(start, end+1);
			if(subString.equals(new StringBuilder(subString).reverse().toString())) {
				if(subString.length()>maxLength) {
					palindromic = subString;
				}
				maxLength = Math.max(maxLength, subString.length());
			}
			end++;
			if(end==str.length()) {
				start++;
				end = start;
			}
			
		}
		
		
		return palindromic;
	}
	
	
	
	
	
	public static boolean isPalindrome(String str) {
		StringBuilder build = new StringBuilder(str);
		
		return str.equals(build.reverse().toString());
	}
	
	
}
