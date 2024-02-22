package com.shrajan.bitwise.Practise;

public class SumTwoNumbers {

	public static void main(String[] args) {
		int a =15;
		int b=5;
		//a = ~a;
		//int result = sumTwoNumbers(a, b);
		
		
		
		int result = substractUsing2sComplement(a, b);
        System.out.println(result);
	}

	
	public static int substractUsing2sComplement(int a, int b) {
		b=sumTwoNumbers(~b,1);
		
		return sumTwoNumbers(a, b);
	}
	
	
	
	public static int substractTwoNumbers(int a , int b) {
		int result = 0;
		System.out.println(Exp.padZeros(a));
		System.out.println(Exp.padZeros(b));
		
		while(b!=0) {
			int borrow = (~a)&b;
			System.out.println(" borrow a&b "+Exp.padZeros(borrow));
			a = a^b;
			System.out.println(" a  ^ b "+Exp.padZeros(a));
			b = borrow<<1;
			System.out.println(" borrow <<1 "+Exp.padZeros(b));
		}
		
		result = a;
		
		return result;
	}
	
	
	
	
	public static int sumTwoNumbers(int a, int b) {
		
		int result = 0;
		
		System.out.println(Exp.padZeros(a));
		System.out.println(Exp.padZeros(b));
		
		while(b!=0) {
			int carry = a&b;
			System.out.println(" carry a&b "+Exp.padZeros(carry));
			
			a = a^b;
			System.out.println(" a  ^ b "+Exp.padZeros(a));
			
			b = carry<<1;
			System.out.println(" carry <<1 "+Exp.padZeros(b));
			
			System.out.println(b);
		}
		
		result = a;
		
		System.out.println(Exp.padZeros(result)
				);
		
		return result;
	}
	
	
	
}
