package com.shrajan.bitwise.Practise;

public class BitwiseGrammer {

	public static void main(String[] args) {
	
		
		System.out.println(sum(2, 3));
		System.out.println(substract(5, 3));

	}
	
	
	 /*
			0 + 0 = 0
			0 + 1 = 1
			1 + 0 = 1
			1 + 1 = 0 (with a carry of 1)
	 */
	
    public static int sum(int a, int b) {
		
		int result = 0 ;
		
		while(b!=0) {
			int carry = a&b;
			a= a^b;
			b = carry<<1;
		}
		
		result = a;
		
		return result;
	}
	/*
			0 - 0 = 0
			1 - 0 = 1
			0 - 1 = 1 (with borrowing from the next higher bit)
			1 - 1 = 0
	 */
	public static int substract(int a, int b) {
	   int result = 0;
	   while(b!=0) {
		   int borrow = (~a)&b;
		   a = a^b;
		   b= borrow<<1;
	   }
	  result = a;
	  return result;
	}
	
	
	/*
	 *
			0 * 0 = 0
			0 * 1 = 0
			1 * 0 = 0
			1 * 1 = 1
	 */
	
	public static int multiply(int a, int b) {
        int result = 0;

        while (b != 0) {
            // If the rightmost bit of b is set, add a to the result
            if ((b & 1) == 1) {
                result = sum(result, a);
            }

            // Shift a to the left and b to the right
            a <<= 1;
            b >>= 1;
        }

        return result;
    }
	
	/*
			0 ÷ 1 = 0 (Quotient bit is 0)
			1 ÷ 1 = 1 (Quotient bit is 1)
			0 ÷ 0 and 1 ÷ 0 are not defined (division by zero is undefined)
	 */
	
	 public static int divide(int dividend, int divisor) {
	        // Handle division by zero
	        if (divisor == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }

	        // Initialize quotient and remainder
	        int quotient = 0;
	        int remainder = 0;

	        // Loop through each bit of the dividend
	        for (int i = 31; i >= 0; i--) {
	            // Shift remainder to the left by one bit and add the next bit of the dividend
	            remainder = (remainder << 1) | ((dividend >> i) & 1);

	            // If the remainder is greater than or equal to the divisor, subtract divisor from remainder
	            if (remainder >= divisor) {
	                remainder = substract(remainder, divisor);
	                quotient = (quotient << 1) | 1; // Set the current bit in the quotient
	            } else {
	                quotient = quotient << 1; // Shift left and set the current bit to 0
	            }
	        }

	        return quotient;
	    }
	
	

}
