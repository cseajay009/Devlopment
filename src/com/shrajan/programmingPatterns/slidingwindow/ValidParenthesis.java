package com.shrajan.programmingPatterns.slidingwindow;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		System.out.println(isValid("){"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));

	}

	
	
	
	 public static boolean isValid(String s) {
	     boolean toReturn =  false;
	     if(s.trim().length()<2) return false;
	    // if(s.startsWith(")")||s.startsWith("}")||s.startsWith("]")) return false;
	     Stack<Character> stack =  new Stack<Character>();   	 
	   
	     
	     
	     HashMap<Character, Character> map =  new HashMap<Character, Character>();
	     map.put('(', ')');
	     map.put('{', '}');
	     map.put('[', ']');
	     
	     for(Character ch: s.toCharArray()) {
	    	 if(ch.equals('(')||ch.equals('{')|| ch.equals('[')) {
	    		 stack.push(ch);
	    	 }else if(ch.equals(')')||ch.equals('}')||ch.equals(']')) {
	    		 if(!stack.isEmpty()&&map.get(stack.peek()).equals(ch)) {// Identify groups here
	    			 stack.pop();
	    		 }else {
	    			 return false;
	    		 }
	    	 }
	     }
	     if(stack.isEmpty()) {
	    	 toReturn = true;
	     }
		 
		 return toReturn;
	 }// TC O(n)  SC O(n)+O(1)
	 
	 // Top 98 %
	 public static boolean isValidOptimized(String s) {
		 
		 
		 Stack<Character> stack =  new Stack<Character>();
		 
		 for(Character ch: s.toCharArray()) {
			 if(ch=='(') {
				 stack.push(')');
			 }else if(ch=='{') {
				 stack.push('}');
			 }else if(ch=='[') {
				 stack.push(']');
			 }else if(stack.isEmpty() || stack.peek()!=ch) {
				 return false;
			 }
			 
			 
			 
			 
		 }
		 
		 
		 return stack.isEmpty();
	 }
	 // Top 100 %
	 public boolean isValidbestKnownSoFar(String s) {

	        char[] stack = new char[s.length()];
	        int i = -1;
	        if (s.length() % 2 != 0)
	            return false; // Smart work to return false if the count cannot be a group
	        for (char ch : s.toCharArray()) {
	            if (i == -1 || (ch == '(' || ch == '{' || ch == '[') ) {
	                stack[++i] = ch; // Pushing to stack
	            } else if ((stack[i] == '(' && ch == ')')
	                    || (stack[i] == '{' && ch == '}')
	                    || (stack[i] == '[' && ch == ']')) {
	                --i; // Popping the Stack
	            } else {
	                return false;
	            }

	        }

	        return i == -1;// if every thing else has matched then i should be -1
	    }
	
}
