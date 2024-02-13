package com.shrajan.programmingPatterns.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSlidingWindow {

	public static void main(String[] args) {
	   
		System.out.println(minSlidingWindowPrac("ADOBECODEBANC", "ABC"));
		System.out.println(minWindowv2("a", "a"));
		System.out.println(minWindowv2("a", "aa"));
/**
 *  Kudos works for valid input, Need to add logic to handle negative scenarios
 */
	}
	
	/*
	 * minlength subString in s that has all characters of t in same frequency
	 */
	 public static String minSlidingWindowPrac(String s , String t) {
		 String toReturn = "";
		 Map<Character,Integer> hs =  new HashMap<Character, Integer>();
		 Map<Character,Integer> tracker =  new HashMap<Character, Integer>();
		
		 for(Character ch: t.toCharArray()) {
			 hs.put(ch, hs.getOrDefault(ch, 0)+1);
		 }
		 System.out.println(s);
		 int left=0;
		 int right=0;
		 int required = hs.size();
		 int currentMatch = 0;
		
		 int subStrLength = Integer.MAX_VALUE;
		 
		 
		 for(right=0; right<s.length(); right++) {
			 char curr_ch = s.charAt(right);
			 tracker.put(curr_ch, tracker.getOrDefault(curr_ch, 0)+1);
			 
			 if(hs.containsKey(curr_ch)
					 && tracker.get(curr_ch).intValue()==hs.get(curr_ch).intValue()) {
				 
				 currentMatch++;
				 
				 
			 }
			 
			 while(required==currentMatch) {
				 
				 if(subStrLength> right-left+1) {
					 subStrLength = right-left+1;
					 toReturn = s.substring(left,right+1);
					
				 }
				 char ch_left = s.charAt(left);
				 
				 tracker.put(ch_left, tracker.getOrDefault(ch_left, 0)-1);
				 if(hs.containsKey(ch_left)&& hs.get(ch_left).intValue()>tracker.get(ch_left).intValue()) {
					 currentMatch--;
				 }
				 left++;
			 }
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
		 return toReturn;
	 }
	
	 public String minWindowTop100(String s, String t) {
	        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
	                s.length() < t.length()) {
	            return new String();
	        }
	        int[] map = new int[128];
	        int count = t.length();
	        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
	        
	        for (char c : t.toCharArray()) {
	            map[c]++;
	        }

	        char[] chS = s.toCharArray();

	        while (end < chS.length) {
	            if (map[chS[end++]]-- > 0) {
	                count--;
	            }
	            while (count == 0) {
	                if (end - start < minLen) {
	                    startIndex = start;
	                    minLen = end - start;
	                }
	                if (map[chS[start++]]++ == 0) {
	                    count++;
	                }
	            }
	        }

	        return minLen == Integer.MAX_VALUE ? new String() :
	                new String(chS, startIndex, minLen);
	    }
	
	 public static String minWindowv2(String s, String t) {
		 
		
		 
	     String subString = "";
	     // valid characters in the Array [a-zA-z]
	     int[] storeCount = new int[52];
	     
	     for(Character temp:t.toCharArray()) {
	    	 storeCount[temp-'A']++;
	     }
	     
	    // int windowSize = t.length()+1; 
	     // Valid first window should be the one which includes all the characters in the target
	     // Keep Moving Right pointer so that 
	     
	   //  boolean correctWindow = validateSubString(s.substring(0,windowSize), storeCount.clone(),storeCount);
	   //   if(correctWindow)return s.substring(0,windowSize);
	     
	     
	     int left = 0;
	     int right = 0;
	     boolean validFound =false;
	     int minimumLength = Integer.MAX_VALUE;
	     while(right<=s.length()) {
	    	 validFound = validateSubString(s.substring(left, right), storeCount.clone(),storeCount);
	    	 if(validFound) {
	    		
	  if(minimumLength==Integer.MAX_VALUE||subString.length()<minimumLength)subString = s.substring(left, right);
	    		
	    		 
	    		 minimumLength = Math.min(minimumLength, subString.length());
	    		 
	    		 while(right>left) {
	    			 left++;
	    		 }
	    		 
	    		 
	    		 
	    		 
	    	 }
	    	 right++;
	    	
	    	
	     }
	     
	     System.out.println(minimumLength);
	     
	     
	     return subString;
	    }
	
	
	 public static String minWindow(String s, String t) {
		 
		 if(s.length()==1 && t.length()==1) return s;
		 if(s.length()<t.length()) return "";
		 
	     String subString = "";
	     // valid characters in the Array [a-zA-z]
	     int[] storeCount = new int[52];
	     
	     for(Character temp:t.toCharArray()) {
	    	 storeCount[temp-'A']++;
	     }
	     
	     int windowSize = t.length()+1; 
	     // Valid first window should be the one which includes all the characters in the target
	     // Keep Moving Right pointer so that 
	     
	     boolean correctWindow = validateSubString(s.substring(0,windowSize), storeCount.clone(),storeCount);
	    // System.out.println(">> First Sub String >>"+s.substring(0, windowSize));
	     if(correctWindow)return s.substring(0,windowSize);
	     
	     
	     int left = 0;
	     int right = windowSize;
	     boolean validFound =false;
	     while(right<=s.length()) {
	   // 	 System.out.println(">>  Sub String >>"+s.substring(left, right));
	    	 validFound = validateSubString(s.substring(left, right), storeCount.clone(),storeCount);
	    	 if(validFound)return s.substring(left, right);
	    	 
	    	 right++;
	    	 left++;
	     }
	     
	     
	     
	     
	     return subString;
	    }
	 
	 public static boolean validateSubString(String str, int[]counts,int[] orgcount) {
		for(Character ch:str.toCharArray()) {
			if(counts[ch-'A']>0)
			     counts[ch-'A']--;
		}
		int sum = Arrays.stream(counts).sum();
	//	System.out.println(">> subStry  "+str+"");
		if(sum==0 ) return true;
		else return false;
		
	}
	 
	 
	 
}
