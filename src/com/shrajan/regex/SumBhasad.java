package com.shrajan.regex;

public class SumBhasad {

	 public static void main(String[] args) {
	
		//System.out.println(formatWithCommas(addStrings("666666666", "5555555555")));
		 //0 1 1 2 3 5
		//System.out.println(formatWithCommas(getnthFibonnaci(17)));
		 
		 System.out.println(addStrings("1111", "23"));
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
	
	public static String getnthFibonnaci(int n) {
		if(n==0)return 0+"";
		if (n==1) return 1+"";
		
		return addStrings(getnthFibonnaci(n-1),getnthFibonnaci(n-2));
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
         String toReturn = formatWithCommas(result.toString());
         return toReturn;
    }
	 
	 public static String formatWithCommas(String numericString) {
	        // Using regex to insert commas at the appropriate positions
	        String formattedString = numericString.replaceAll("(?<=\\d)(?=(\\d{3})+(?!\\d))", ",");
	        return formattedString;
	    }

}
