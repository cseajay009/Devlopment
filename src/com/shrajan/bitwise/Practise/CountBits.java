package com.shrajan.bitwise.Practise;

import java.util.Arrays;

public class CountBits {

	public static void main(String[] args) {
		int [] res = noobSolution(2);

		Arrays.stream(res).forEach(e->System.out.println(e));
	}
	
	
	
    public int[] countBits(int n) {
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        int offset = 1;
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) { // if current number "i" is power of 2
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
    
    
    public static int[] noobSolution(int n) {
    	int [] result = new int[n+1];
    	for(int i=0; i<result.length;i++) {
    		result[i] = hammingWeight(i);
    	}
    	return result;
    }
    
    
    public static int hammingWeight(int n) {
    	int result = 0;
    	
    	for(int i=0; i<32; i++) {
    		int mask =  1<<i;
    		if((n&mask)!=0)result++;
    	}
    	
    	return result;
    }
    
    

}
