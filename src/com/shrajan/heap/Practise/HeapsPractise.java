package com.shrajan.heap.Practise;

import java.util.PriorityQueue;

public class HeapsPractise {

	
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
	static PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->a-b);
	
	
	public static void main(String args[]) {
		
		
		int [] arr = new int[] {5,3,1,2};
		
		/*
		 * 1,2,3,5
		 */
		for(int temp:arr) {
			
			minHeap.add(temp);
			maxHeap.add(minHeap.poll());
			
			if(maxHeap.size()>minHeap.size()) {
				minHeap.add(maxHeap.poll());
			}
			
			
		}
		
		System.out.println(minHeap);
		System.out.println(maxHeap);
		
		System.out.println(findMedian());
	}
	
	public void addNum(int num) {
		
	}
	
	public  static double findMedian() {
		
		if(maxHeap.size()==minHeap.size()) {
			System.out.println(maxHeap.peek());
			System.out.println(minHeap.peek());
			return (maxHeap.peek()+minHeap.peek())/2.0;
		}
		
		return minHeap.peek();
	}
	
	
}
