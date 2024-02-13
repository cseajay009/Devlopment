package com.shrajan.programmingPatterns.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeString {

	public static void main(String[] args) {
		String encodeStr = encode(Arrays.asList(new String[] {"we", "say", "#", "yes"}));
		System.out.println(encodeStr);
		List<String> decodedlist = decode(encodeStr);
		System.out.println(decodedlist);
		
		//System.out.println(encode(Arrays.asList(new String[] {"we", "say", ":", "yes"})));

	}

	static String delimeterPattern = "#&";
	public static String encode(List<String> strs) {
		 String encoded = ""; // ["lint","code","love","you"] -> "4#lint4#code4#love3#you"
	        for (String s : strs) {
	            encoded = encoded + s.length() + "#" + s;
	        }
	        return encoded;
    }

	
	public static List<String> decode(String str) { 
		List<String> list = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        int j = i;
        while (str.charAt(j) != '#') j++;
        int len = Integer.parseInt(str, i, j, 10);
        list.add(str.substring(j + 1, j + len + 1));
        i = j + len + 1;
    }
    return list;}
}
