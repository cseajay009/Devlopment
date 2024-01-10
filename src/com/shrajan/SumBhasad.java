package com.shrajan.streams;

public class SumBhasad {

	public static void main(String[] args) {
		
	//	String results = addStrings("123", "23");
		//System.out.println(results);
		
		System.out.println(checkPalindrome("radar"));
		
	//	 String check2 =  String.format("%s", num2);
		// System.out.println(check2);
	}
	
	
	public static boolean checkPalindrome(String one) {
		String org = one;
		StringBuilder builder =  new StringBuilder(one);
		
		one = builder.reverse().toString();
		if(org.equals(one)) {
			return true;
		}
		return false;
	}
	
	
	
	
	 public static String checkFormat() {
		 String num1="55555",num2="333";
		 String check = String.format("%" + (num1.length()) + "s", num2).replace(" ", "0");
		
		 System.out.println("First number :"+num1);
		 System.out.println("Second number :"+check);
		 
		 return check;
		 
	 } 
	
	
	
	 public static String addStrings(String num1, String num2) {
         // Ensure num1 is the longer number
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Pad the shorter number with zeros to make lengths equal
        num2 = String.format("%" + num1.length() + "s", num2).replace(' ', '0');

        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Iterate through digits from right to left
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digitSum = Character.getNumericValue(num1.charAt(i)) +
                    Character.getNumericValue(num2.charAt(i)) + carry;
            carry = digitSum / 10; // Calculate carry for the next iteration
            result.insert(0, digitSum % 10); // Store the current digit in the result
        }

        // If there's a remaining carry after the loop ends
        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

}
