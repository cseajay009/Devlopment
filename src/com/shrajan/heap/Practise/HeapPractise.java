package com.shrajan.heap.Practise;

import java.util.PriorityQueue;

public class HeapPractise {

	PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->a-b);
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a); 
	public static void main(String[] args) {
		HeapPractise find = new HeapPractise();
    	find.addNum(5);// maxheap
    	find.addNum(3); // minheap
    	find.addNum(1); // minheap
    	find.addNum(2); 
    	find.addNum(4); 
    	System.out.println(find.findMedian());

	}

	// We need to add number to the queue
	
    public void addNum(int num) {
        System.out.println("<<<< Adding Number >>>>"+num);
    	minHeap.add(num);  // Add every number to min heap
    	maxHeap.add(minHeap.poll());
    	
    	if(maxHeap.size()>minHeap.size()) {
    		minHeap.add(maxHeap.poll());
    	}
    	
    	System.out.println(">> Max Heap  >> "+maxHeap);
    	System.out.println(">> Min Heap  >> "+minHeap);
    }
    
    public double findMedian() {
        
    	if(maxHeap.size()==minHeap.size()) {
    		return (minHeap.peek()+maxHeap.peek())/2;
    	}
    	
    	return minHeap.peek();
    }
}
