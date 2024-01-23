package com.shrajan.leetcode.blind75;



public class MergeTwoList {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1); 
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);
	    //1,3,4
		ListNode list2 = new ListNode(1); 
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		ListNode head = mergeTwoLists(list1, list2);
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;
		while(list1!=null && list2!=null) {
			if(list1.val>list2.val) {
				current.next = list2;
				list2 = list2.next;
			}else if(list2.val>list1.val) {
				current.next = list1;
				list1 = list1.next;
			}else {
				current.next = list2;
				list2 = list2.next;
				current = current.next;
				current.next = list1;
				list1 = list1.next;
			}
			
			current = current.next;
		}
		
		if(list1!=null) {
			current.next = list1;
		}
		if(list2!=null) {
			current.next = list2;
		}
		
		
		return dummy.next;
	 }
	
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		     ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
}
