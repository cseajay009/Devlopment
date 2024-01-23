package com.shrajan.leetcode.blind75;

public class ReverseALinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1); 
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		/*
		 * ListNode reversed = reverseList(head); while(reversed!=null) {
		 * System.out.println(reversed.val); reversed = reversed.next; }
		 */

	    //	System.out.println(hasCycle(head));
		
		ListNode currentNode = removeNthFromEnd(head, 5);
		
		while(currentNode!=null) {
			System.out.println(currentNode.val);
			currentNode = currentNode.next;
			
		}
	}
	
	
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	 ListNode dummy = new ListNode(-1);
         dummy.next = head;

         ListNode fastPointer = dummy;
         ListNode slowPointer = dummy;

         for(int i=0;i<=n;i++){
             fastPointer = fastPointer.next;
         }

         while(fastPointer!=null){
             fastPointer = fastPointer.next;
             slowPointer = slowPointer.next;
         }

         slowPointer.next = slowPointer.next.next;

         return dummy.next;
    	
    }
    
    
    public static ListNode removeNode(ListNode head ,int n) {
    	ListNode current = head;
    	
    	int index = 0;
    	ListNode prev = head;
    	while(current!=null) {
    		current = current.next;
    		
    		
    		if(index==n&&current.next!=null) {
    			prev.next = current.next;
    		}
    		prev = current;
    		index++;
    	}
    	
    	return head;
    }
	
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
	
	
	
	
	
	//1,2,3,4,5
	 public static ListNode reverseList(ListNode head) {
	    ListNode current = head;
	    ListNode previous = null;
	    while(current!=null) {
	    	ListNode tmp = current.next;
	    	current.next = previous;
	    	previous = current;
	    	current = tmp;
	    }
	    
	    return previous;
	 }
	 
	 public static boolean hasCycle(ListNode head) {
	        if (head == null || head.next == null) {
	            return false;
	        }

	        ListNode slow = head;
	        ListNode fast = head.next;

	        while (slow != fast) {
	            if (fast == null || fast.next == null) {
	                return false;
	            }
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        return true;
	    }
}



