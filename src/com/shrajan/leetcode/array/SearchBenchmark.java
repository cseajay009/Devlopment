package com.shrajan.leetcode.array;

public class SearchBenchmark {

    public static void main(String[] args) {
        int[] sortedArray = generateSortedArray(1000000);
        int target = 777777;

        // Benchmark Binary Search
        long binarySearchStartTime = System.currentTimeMillis();
        int binarySearchResult = binarySearch(sortedArray, target);
        long binarySearchEndTime = System.currentTimeMillis();
        System.out.println("Binary Search Result: " + binarySearchResult);
        System.out.println("Binary Search Time: " + (binarySearchEndTime - binarySearchStartTime) + " milliseconds");

        // Benchmark Brute Force Search
        long bruteForceStartTime = System.currentTimeMillis();
        int bruteForceResult = bruteForceSearch(sortedArray, target);
        long bruteForceEndTime = System.currentTimeMillis();
        System.out.println("Brute Force Search Result: " + bruteForceResult);
        System.out.println("Brute Force Search Time: " + (bruteForceEndTime - bruteForceStartTime) + " milliseconds");
    }

    public static int binarySearch(int[] array, int target) {
      
       
       int low = 0;
       int high = array.length-1;
       
       while(low<=high) {
    	   int mid = low+(high-low)/2;
    	   
    	   if(array[mid]==target)return mid;
    	   else if(array[mid]<target) {
    		   low = mid+1;
    	   }else {
    		   high = mid-1;
    	   }
    		   
       }
       
       
       
       
       return -1;
       
    }

    public static int bruteForceSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
}

