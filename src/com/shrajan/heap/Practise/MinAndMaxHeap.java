package com.shrajan.heap.Practise;

import java.util.PriorityQueue;

public class MinAndMaxHeap {

	static PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->a-b);
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
	
	public static void main(String[] args) {
		
		minHeap.add(1);
		minHeap.add(2);
		minHeap.add(3);
		minHeap.add(4);
		minHeap.add(5);
		minHeap.add(6);
		minHeap.add(7);
		minHeap.add(8);

		System.out.println(minHeap.peek());
		System.out.println(maxHeap.peek());
		maxHeap.add(1);
		maxHeap.add(2);
		maxHeap.add(3);
		maxHeap.add(4);
		maxHeap.add(5);
		maxHeap.add(6);
		maxHeap.add(7);
		maxHeap.add(8);
		
		System.out.println(maxHeap.peek());
	}
	
	
	

}
