package com.shrajan.bitwise.Practise;

import java.util.Arrays;

public class Exp {

	public static void main(String[] args) {
		//playBitwiseLeftShift(5);
		
		int a = 2;
		int b = 5;
		
		System.out.println(padZeros(a));
		System.out.println(padZeros(b));
		
		System.out.println(" AND Results");
		playOperator(a, b, Operators.AND);
		System.out.println();
		System.out.println(" OR Results");
		playOperator(a, b, Operators.OR);
		System.out.println();
		System.out.println(" XOR Results");
		playOperator(a, b, Operators.XOR);
		System.out.println();
		System.out.println(" NOR Results");
		playOperator(a, b, Operators.NOR);

	}

	
	public static void playOperator(int a, int b, String opt) {
		int result=0;
		if(opt.equals(Operators.AND)) {
			result =  a&b;
		}else if(opt.equals(Operators.OR)) {
			result   = a|b; 
		}else if(opt.equals(Operators.XOR)) {
			result = a^b;
		}else if(opt.equals(Operators.NOR)) {
			result = ~a;
		}else if(opt.equals(Operators.leftShift)) {
			result = a<<1;
		}else if(opt.equals(Operators.rightShift)) {
			result = a>>1;
		}
		System.out.println(padZeros(result));
	}
	
	
	
	public static void playBitwiseLeftShift(int a) {
		
		System.out.println(padZeros(a));
		int val = a<<1;
		
		
		System.out.println(padZeros(val));
	}
	
	
	
	public static String padZeros(int s) {
		char[] ch = new char[32];
		Arrays.fill(ch, '0');
		String str = Integer.toBinaryString(s);
		if(str.length()==32)return str;
		int startIndex = 32-str.length();
		for(char c : str.toCharArray()) {
			ch[startIndex++]=c;
		}
		
		
		
		StringBuffer buffer =  new StringBuffer();
		
		for(char chh:ch) {
			buffer.append(chh);
		}
		
		
		
		return buffer.toString();
	}
}
