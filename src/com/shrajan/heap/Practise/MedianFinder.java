package com.shrajan.heap.Practise;

import java.util.PriorityQueue;

public class MedianFinder {
	
	
	
	    public static void main(String args[]) {
	    	MedianFinder find = new MedianFinder();
	    	find.addNum(1);
	    	find.addNum(2);
	    	find.addNum(3);
	    	find.addNum(4);
	    	System.out.println(find.findMedian());
	    }
	
	    PriorityQueue<Integer> maxHeap;
	    PriorityQueue<Integer> minHeap;
	    
	    public MedianFinder() {
	        maxHeap = new PriorityQueue<>((a, b) -> b - a);
	        minHeap = new PriorityQueue<>((a, b) -> a - b);
	    }
	    public void addNum(int num) {
	        // Add the number to one of the heaps
	        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
	            maxHeap.add(num);
	        } else {
	            minHeap.add(num);
	        }

	        // Balance the heaps
	        if (maxHeap.size() > minHeap.size() + 1) {
	            minHeap.add(maxHeap.poll());
	        } else if (minHeap.size() > maxHeap.size()) {
	            maxHeap.add(minHeap.poll());
	        }
	    }
	    public void addNumol(int num) {
	        minHeap.add(num);// adds the current number
	        maxHeap.add(minHeap.poll()); // adds the top from minheap
	        if (minHeap.size() < maxHeap.size()) {
	            minHeap.add(maxHeap.poll());
	        }
	    } // TC: O(log n), SC: O(log n)
	    
	    public double findMedian() {
	        if (minHeap.size() == maxHeap.size()) { // even number of integers
	            return (minHeap.peek() + maxHeap.peek()) / 2.0;
	        }
	        return minHeap.peek();
	    } // TC: O(1), SC: O(1)
}
