package com.shrajan.leetcode.blind75;

import java.util.Arrays;

public class SetMatrixZeros {

	public static void main(String[] args) {
		
		int[][] matrix = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
		
		setZeroes(matrix);
		
		traverseRowWise(matrix);

	}
	
	
	// brute force Solution works but it is not very efficient :( 
    public static void setZeroes(int[][] matrix) {
    
    	int row = matrix.length-1;
    	int column = matrix[0].length-1;
    	int [][] resultMatrix = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
    	for(int i=0;i<=row;i++) {
    		
    		
    		for(int j=0;j<=column;j++) {
    		
    			
    			if(matrix[i][j]==0) {
    				
    				int rowCopy = i;
    				int columnCopy = j;
    			
    				for(int k=0; k<=row;k++) {
    					
    					for(int l=0; l<=column;l++) {
    						if(k==rowCopy )
    						    resultMatrix[k][l] = 0;
    						
    					}
    				}
                   
    				for(int k=0; k<=column;k++) {
    					
    					for(int l=0; l<=row;l++) {
    						if(k==columnCopy) {
    							
    							resultMatrix[l][k] = 0;
    							
    						}
    					}
    				}
    				
    				
    				
    				
    				// condition met ,  if we try setting the matrix row and column here then it's a problem
    				// since in the next iteration we might see an element that we updated and entire matrix 
    				// will get filled with zeros
    				
    				// One approach can be to keep on adding row and column in some data structure which can be
    				// retrieved after executing this loop and then filling only that row and column with zeros
    				// that will not check or touch any other attribute , however complexity will increase since
    				// again we have to loop around the entire matrix, Let's solve first with this approach and 
    				// later we will optimize this
    				
    			}
    		}
    	}
    	//matrix = resultMatrix;
    	copy(matrix, resultMatrix);
    }
    
    static void copy(int[][]old, int[][] transformed) {
    	for(int i=0; i<old.length; i++)
    		  for(int j=0; j<old[i].length; j++)
    		    old[i][j]=transformed[i][j];
    }
    
    
    static void traverseRowWise(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
