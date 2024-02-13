package com.shrajan.leetcode.blind75.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CloneGraph {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	
	 public static int lengthOfLongestSubstring(String s) {
		 int length=0;
	        Set<Character> visited = new HashSet<Character>();

	        char[] chars = s.toCharArray();
	        int maxLength = -1;
	        for(char ch: chars) {
	        	if(!visited.contains(ch)) {
	        		visited.add(ch);
	        		length++;
	        		maxLength =  Math.max(length, maxLength);
	        	}else {
	        		visited.clear();
	        		length=0;
	        	}
	        }
	        
	        
	        
	        return maxLength;
	    }
	
	
	
	
	
	public Node cloneGraph(Node node) {
        if (node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node newNode = new Node(node.val);
        map.put(node, newNode);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            List<Node> newNeighbors = map.get(curr).neighbors;
            for (Node n : curr.neighbors) {
                if (!map.containsKey(n)) {
                    Node tmp = new Node(n.val);
                    map.put(n, tmp);
                    queue.add(n);
                }
                newNeighbors.add(map.get(n));
            }
        }
        return newNode;
    }
}
