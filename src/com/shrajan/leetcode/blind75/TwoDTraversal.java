package com.shrajan.leetcode.blind75;

public class TwoDTraversal {

	public static void main(String[] args) {
		traverseDiagonal(new int[][] {{1,2,3},{4,5,6},{7,8,9}},true);

	}

	 public static void populateZeros(int[][] matrix, int row, int column) {
		 
		 //Populating rows
		 for(int i=0; i<matrix[row].length; i++) {
			 matrix[row][i] = 0;
		 }
		 
		 //Populate Coulmns
		
		 for(int i=0; i<matrix.length; i++) {
			 
			for(int j=0;i<matrix[1].length;j++) {
				if(column==j) {
					matrix[i][j]=0;
				}
			}
		 }
		 
		 
	 }
	
	
	 public static void printEachElement(int[][] matrix) {
	        
	 // Basic Looping
		 // 
		 for(int i=0; i<matrix.length;i++) { // Moves the cursor to each row
			 System.out.println(" >>> Row Number"+i);
			 for(int j=0;j<matrix[1].length;j++) { // Moves the cursor to each column in above row
				 
				 System.out.println(matrix[i][j]);
				 
				
				 
				 
			 }
			 
			 System.out.println("<<< Row Ends Here >>>");
			 
			 
		 }
		 
		 
		 
		 
		 
	 
	 
	 
	 
	 }
	 
	 
	 static void traverseDiagonal(int[][] matrix,boolean isLeftToRight) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
            
	        if(isLeftToRight) {
	        int maxLength = Math.min(rows, cols);

	        for (int i = 0; i < maxLength; i++) {
	            System.out.print(matrix[i][i] + " ");
	        }

	        System.out.println();
	        
	        // now lets try to get another diagonal from right to left
	        
	        // first find end column and keep reducing it by 1
	        // outer loop will keep increasing row and the inner loop will keep decrementing column value by one
	        }else {
	        int endColumn = matrix[0].length-1;
	        int endRow = matrix.length-1;
	        
	        
	        for(int i=0; i<=endRow ; i++) {
	        	
	        	//iteration 1
	        	System.out.println(matrix[i][endColumn--]);
	        	
	        }
	        
	        }
	       
	    }
	
	 static void traverseRowWise(int[][] matrix) {
	        for (int row = 0; row < matrix.length; row++) {
	            for (int col = 0; col < matrix[row].length; col++) {
	                System.out.print(matrix[row][col] + " ");
	            }
	            System.out.println();
	        }
	    }

	    static void traverseColumnWise(int[][] matrix) {
	        for (int col = 0; col < matrix[0].length; col++) {  // Moves the cursor to each column
	            for (int row = 0; row < matrix.length; row++) { // Moves the cursor to all the rows for each column
	                System.out.print(matrix[row][col] + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    static void spiralTraverse(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int top = 0;
	        int bottom = rows - 1;
	        int left = 0;
	        int right = cols - 1;

	        while (top <= bottom && left <= right) {
	            // Traverse top row
	            for (int i = left; i <= right; i++) {
	                System.out.print(matrix[top][i] + " ");
	            }
	            top++;

	            // Traverse right column
	            for (int i = top; i <= bottom; i++) {
	                System.out.print(matrix[i][right] + " ");
	            }
	            right--;

	            // Traverse bottom row
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    System.out.print(matrix[bottom][i] + " ");
	                }
	                bottom--;
	            }

	            // Traverse left column
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    System.out.print(matrix[i][left] + " ");
	                }
	                left++;
	            }
	        }
	    }   
	    
	    static void antiClockwiseSpiralTraverse(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int top = 0;
	        int bottom = rows - 1;
	        int left = 0;
	        int right = cols - 1;

	        while (top <= bottom && left <= right) {
	            // Traverse left column
	            for (int i = top; i <= bottom; i++) {
	                System.out.print(matrix[i][left] + " ");
	            }
	            left++;

	            // Traverse bottom row
	            for (int i = left; i <= right; i++) {
	                System.out.print(matrix[bottom][i] + " ");
	            }
	            bottom--;

	            // Traverse right column
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    System.out.print(matrix[i][right] + " ");
	                }
	                right--;
	            }

	            // Traverse top row
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    System.out.print(matrix[top][i] + " ");
	                }
	                top++;
	            }
	        }
	    } 
	
}
