package com.shrajan.programmingPatterns.slidingwindow;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String args[]) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}
	 public String sortString(String str){
	        
	        char[] ch = str.toCharArray();
	        Arrays.sort(ch);
	        
	        return new String(ch);
	    }
	
	public static boolean isAnagram(String s, String t) {
		
		   if(s.length()!=t.length()) return false;
		   
	        
	        int[] counts =  new int[26];

	       for(Character ch: s.toCharArray()){
	           counts[ch-'a']++;
	       }

	        for(Character th: t.toCharArray()) {
	        	counts[th-'a']--;
	        }
	        
	        
	     int sum =  Arrays.stream(counts).sum();  
	        
	     
	     
	     if(sum==0) return true;
	     else
	    	 return false;
	     
	}
	
	
}
