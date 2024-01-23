package com.shrajan.leetcode.blind75;

public class DiagonalTraversalRightToLeft {

	public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Diagonal Traversal (Right to Left):");
        diagonalTraverseRightToLeft(matrix);
    }

    static void diagonalTraverseRightToLeft(int[][] matrix) {
    	 int endColumn = matrix[0].length-1;
	        int endRow = matrix.length-1;
	        
	        
	        for(int i=0; i<=endRow ; i++) {
	        	
	        	//iteration 1
	        	System.out.println(matrix[i][endColumn--]);
	        	
	        }
        System.out.println();
    }
}
