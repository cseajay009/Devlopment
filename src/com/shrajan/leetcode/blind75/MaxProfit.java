package com.shrajan.leetcode.blind75;

public class MaxProfit {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {2,4,1}));

	}
	public int maxProfitW(int[] prices) {
		    int lsf = Integer.MAX_VALUE; // least so far
	        int op = 0; // overall profit
	        int pist = 0; // profit if sold today
	        
	        for(int i = 0; i < prices.length; i++){
	            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
	                lsf = prices[i]; // update our least so far
	            }
	            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
	            if(op < pist){ // if pist is more then our previous overall profit
	                op = pist; // update overall profit
	            }
	        }
	        return op; // return op 
    }
	
	// Not Submitted as it fails in some scenarios
    public static int maxProfit(int[] prices) {
        // consider an array with prices [7,1,5,3,6,4]
    	int maxProfit=0;
    	
    	//find the lowestPrice to buy
    	int lowestPrice = Integer.MAX_VALUE;
    	int index = 0,lowestIndex=0;
    	for(int ch=0;ch<prices.length-1;ch++) {
    		if(lowestPrice!=Math.min(lowestPrice, prices[ch])) {
    			lowestIndex = index;
    			lowestPrice = Math.min(lowestPrice, prices[ch]);
    		}
    		
    		
    		index++;
    	}
    	 int maxRate = Integer.MIN_VALUE;
    	if(lowestPrice!=Integer.MAX_VALUE) {
    	 
    //	 int[] comparisionArray = Arrays.copyOfRange( prices,lowestIndex+1, prices.length-1);
    	
    	 for(int ind = lowestIndex; ind<prices.length;ind++) {
    		 
    		 if(prices[ind]>lowestPrice) {
    			 maxRate= Math.max(prices[ind], maxRate);
    		 }
    		 
    	 }
    	
    	}
    	
    	if(maxRate==Integer.MIN_VALUE) return 0;
    	
    	
    	maxProfit = maxRate-lowestPrice;
    	
    	return maxProfit;
    }
}
